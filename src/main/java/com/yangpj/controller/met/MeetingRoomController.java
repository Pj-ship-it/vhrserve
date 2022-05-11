package com.yangpj.controller.met;

import com.yangpj.model.Conference;
import com.yangpj.model.Meetingroom;
import com.yangpj.model.RespBean;
import com.yangpj.model.RespPageBean;
import com.yangpj.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @Author pj
 * @create 2022/5/11 23:34
 */
@RestController
@RequestMapping("/meeting/meetingroom")
public class MeetingRoomController {
    private final MeetingRoomService meetingRoomService;

    @Autowired
    public MeetingRoomController(MeetingRoomService meetingRoomService) {
        this.meetingRoomService = meetingRoomService;
    }

    @GetMapping("/")
    public RespPageBean findAll() {
        return meetingRoomService.findAll();
    }

    @PostMapping("/")
    public RespBean addAdjust(@RequestBody Meetingroom meetingroom) {
        if (meetingRoomService.addMeetingRoom(meetingroom) == 1) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id) {
        if (meetingRoomService.deleteById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    public RespBean updateById(@RequestBody Meetingroom meetingroom) {
        if (meetingRoomService.updateById(meetingroom) == 1) {
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
