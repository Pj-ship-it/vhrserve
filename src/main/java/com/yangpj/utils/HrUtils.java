package com.yangpj.utils;

import com.yangpj.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @Author pj
 * @create 2022/1/13 0:07
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
