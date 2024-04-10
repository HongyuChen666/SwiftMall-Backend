package com.atchen.swiftmall.manager.service.impl;

import com.atchen.swiftmall.common.log.service.AsyncOperLogService;
import com.atchen.swiftmall.manager.mapper.SysOperLogMapper;
import com.atchen.swiftmall.model.entity.system.SysOperLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsyncOperLogServiceImpl implements AsyncOperLogService {

    @Autowired
    private SysOperLogMapper sysOperLogMapper;

    // Save log data
    @Override
    public void saveSysOperLog(SysOperLog sysOperLog) {
        sysOperLogMapper.insert(sysOperLog);
    }
}
