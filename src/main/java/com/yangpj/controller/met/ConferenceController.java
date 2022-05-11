package com.yangpj.controller.met;

import com.yangpj.model.Conference;
import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import com.yangpj.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @Author pj
 * @create 2022/4/24 20:58
 */
@RestController
@RequestMapping("/meeting/conference")
public class ConferenceController {
    private final ConferenceService conferenceService;

    @Autowired
    public ConferenceController(ConferenceService conferenceService) {
        this.conferenceService = conferenceService;
    }

    @GetMapping("/")
    public RespPageBean findAll() throws IOException {
        return conferenceService.findAll();
    }

    @PostMapping("/")
    public RespBean addAdjust(@RequestBody Conference conference) {
        if (conferenceService.addAdjust(conference) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id) {
        if (conferenceService.deleteById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateById(@RequestBody Conference conference) {
        if (conferenceService.updateById(conference) == 1) {
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
