package com.yangpj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author pj
 */
@SpringBootApplication
@MapperScan("com.yangpj.mapper")
public class YangpjApplication {

    public static void main(String[] args) {
        SpringApplication.run(YangpjApplication.class, args);
    }

}
