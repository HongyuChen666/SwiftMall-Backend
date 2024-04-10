package com.atchen.swiftmall.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "RequestParameterEntity")
public class SysRoleDto {

    @Schema(description = "roleName")
    private String roleName ;

}
