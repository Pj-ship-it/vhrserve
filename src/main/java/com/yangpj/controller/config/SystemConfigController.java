package com.yangpj.controller.config;

import com.yangpj.model.Menu;
import com.yangpj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author pj
 * @create 2022/1/6 22:06
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    private final MenuService menuService;

    @Autowired
    public SystemConfigController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/menu")
    public List<Menu> getMenusByHrId() {
        return menuService.getMenusByHrId();
    }
}
