package com.atchen.swiftmall.model.entity.system;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import lombok.Data;

@Data
public class SysRoleUser extends BaseEntity {

    private Long roleId;
    private Long userId;

}
