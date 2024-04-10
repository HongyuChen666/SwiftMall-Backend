package com.atchen.swiftmall.common.log.service;

import com.atchen.swiftmall.model.entity.system.SysOperLog;

public interface AsyncOperLogService {

    // Save log data
    public abstract void saveSysOperLog(SysOperLog sysOperLog) ;
}
