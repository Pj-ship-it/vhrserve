package com.yangpj.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yangpj.model.Hr;
import com.yangpj.model.RespBean;
import com.yangpj.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author pj
 * @create 2021/12/18 16:13
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // 自定义用户认证逻辑
    private final HrService hrService;

    private final CustomFilterInvocationSecurityMetadataSource customFilterInvocationSecurityMetadataSource;

    private final CustomUrlDecisionManager customUrlDecisionManager;

    @Autowired
    public SecurityConfig(HrService hrService, CustomFilterInvocationSecurityMetadataSource customFilterInvocationSecurityMetadataSource, CustomUrlDecisionManager customUrlDecisionManager) {
        this.hrService = hrService;
        this.customFilterInvocationSecurityMetadataSource = customFilterInvocationSecurityMetadataSource;
        this.customUrlDecisionManager = customUrlDecisionManager;
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 身份认证接口
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //关联数据库和security
        auth.userDetailsService(hrService);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/login");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                    .anyRequest().authenticated()
                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
                    @Override
                    public <O extends FilterSecurityInterceptor> O postProcess(O o) {
                        o.setAccessDecisionManager(customUrlDecisionManager);
                        o.setSecurityMetadataSource(customFilterInvocationSecurityMetadataSource);
                        return o;
                    }
                })
                    .and()
                // 登录认证处理器
                .formLogin()
                    .loginProcessingUrl("/doLogin")
                    .loginPage("/login")
                    .successHandler(new AuthenticationSuccessHandler() {
                        @Override
                        public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                            response.setContentType("application/json;charset=utf-8");
                            PrintWriter writer = response.getWriter();
                            Hr hr = (Hr) authentication.getPrincipal();
                            hr.setPassword(null);
                            RespBean ok = RespBean.ok("登录成功！", hr);
                            String s = new ObjectMapper().writeValueAsString(ok);
                            writer.write(s);
                            writer.flush();
                            writer.close();
                        }
                    })
                    // 登陆失败处理
                    .failureHandler(new AuthenticationFailureHandler() {
                        @Override
                        public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
                            response.setContentType("application/json;charset=utf-8");
                            PrintWriter writer = response.getWriter();
                            RespBean error = RespBean.error("登录失败!");
                            if (e instanceof LockedException) {
                                error.setMsg("账户被锁定，请联系管理员！");
                            } else if (e instanceof CredentialsExpiredException) {
                                error.setMsg("密码过期，请联系管理员！");
                            } else if (e instanceof AccountExpiredException) {
                                error.setMsg("账户过期，请联系管理员！");
                            } else if (e instanceof DisabledException) {
                                error.setMsg("账户被禁用，请联系管理员！");
                            } else if (e instanceof BadCredentialsException) {
                                error.setMsg("用户名或者密码输入错误，请重新输入！");
                            }
                            writer.write(new ObjectMapper().writeValueAsString(error));
                            writer.flush();
                            writer.close();
                        }
                    })
                    .permitAll()
                    .and()
                // 注销处理器
                .logout()
                    .logoutSuccessHandler(new LogoutSuccessHandler() {
                        @Override
                        public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                            response.setContentType("application/json;charset=utf-8");
                            PrintWriter writer = response.getWriter();
                            writer.write(new ObjectMapper().writeValueAsString(RespBean.ok("注销成功！")));
                            writer.flush();
                            writer.close();
                        }
                    })
                    .permitAll()
                    .and()
                // csrf禁用，因为不使用session
                .csrf()
                    .disable()
                // 认证失败处理类
                .exceptionHandling().
                    authenticationEntryPoint((request, response, e) -> {
                        response.setContentType("application/json;charset=utf-8");
                        response.setStatus(401);
                        PrintWriter out = response.getWriter();
                        RespBean respBean = RespBean.error("访问失败！");
                        if (e instanceof InsufficientAuthenticationException) {
                            respBean.setMsg("请求失败，请联系管理员!");
                        }
                        out.write(new ObjectMapper().writeValueAsString(respBean));
                        out.flush();
                        out.close();
                    });
    }
}
