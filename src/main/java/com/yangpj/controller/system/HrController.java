package com.yangpj.controller.system;

import com.yangpj.model.Hr;
import com.yangpj.model.RespBean;
import com.yangpj.model.Role;
import com.yangpj.service.HrService;
import com.yangpj.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author pj
 * @create 2022/1/12 23:57
 */
@RestController
@RequestMapping("/system/hr")
public class HrController {
    private final HrService hrService;

    private final RoleService roleService;

    @Autowired
    public HrController(HrService hrService, RoleService roleService) {
        this.hrService = hrService;
        this.roleService = roleService;
    }

    @GetMapping("/")
    public List<Hr> getAllHrs(String keywords) {
        return hrService.getAllHrs(keywords);
    }

    @PutMapping("/")
    public RespBean updateHr(@RequestBody Hr hr) {
        if (hrService.updateHr(hr) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PutMapping("/role")
    public RespBean updateHrRole(Integer hrid, Integer[] rids) {
        if (hrService.updateHrRole(hrid, rids)) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteHrById(@PathVariable Integer id) {
        if (hrService.deleteHrById(id) == 1) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }
}
