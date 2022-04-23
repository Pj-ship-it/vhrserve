package com.yangpj.service;

import com.yangpj.mapper.MenuMapper;
import com.yangpj.mapper.MenuRoleMapper;
import com.yangpj.model.Hr;
import com.yangpj.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author pj
 * @create 2022/1/7 20:51
 */
@Service
public class MenuService {
    private final MenuMapper menuMapper;

    private final MenuRoleMapper menuRoleMapper;

    @Autowired
    public MenuService(MenuMapper menuMapper, MenuRoleMapper menuRoleMapper) {
        this.menuMapper = menuMapper;
        this.menuRoleMapper = menuRoleMapper;
    }

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    @Cacheable
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    public List<Integer> getMidsByRid(Integer rid) {
        return menuMapper.getMidsByRid(rid);
    }

    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.deleteByRid(rid);
        if (mids == null || mids.length == 0) {
            return true;
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        return result==mids.length;
    }
}
