package com.yangpj.service;

import com.yangpj.mapper.MailSendLogMapper;
import com.yangpj.model.MailSendLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author pj
 * @create 2022/1/13 22:00
 */
@Service
public class MailSendLogService {
    private final MailSendLogMapper mailSendLogMapper;

    @Autowired
    public MailSendLogService(MailSendLogMapper mailSendLogMapper) {
        this.mailSendLogMapper = mailSendLogMapper;
    }

    public Integer updateMailSendLogStatus(String msgId, Integer status) {
        return mailSendLogMapper.updateMailSendLogStatus(msgId, status);
    }

    public Integer insert(MailSendLog mailSendLog) {
        return mailSendLogMapper.insert(mailSendLog);
    }

    public List<MailSendLog> getMailSendLogsByStatus() {
        return mailSendLogMapper.getMailSendLogsByStatus();
    }

    public Integer updateCount(String msgId, Date date) {
        return mailSendLogMapper.updateCount(msgId,date);
    }
}
