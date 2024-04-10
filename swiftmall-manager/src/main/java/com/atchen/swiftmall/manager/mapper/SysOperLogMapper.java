package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.entity.system.SysOperLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysOperLogMapper {
    // Save log data
    void insert(SysOperLog sysOperLog);
}
