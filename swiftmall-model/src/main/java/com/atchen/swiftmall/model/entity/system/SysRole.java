package com.atchen.swiftmall.model.entity.system;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Role entity class")
public class SysRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Schema(description = "Role name")
    private String roleName;

    @Schema(description = "Role code")
    private String roleCode;

    @Schema(description = "Description")
    private String description;

}
