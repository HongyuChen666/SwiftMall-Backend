package com.atchen.swiftmall.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "Request parameter entity class")
public class SysUserDto {

    @Schema(description = "Search keyword")
    private String keyword ;

    @Schema(description = "Start time")
    private String createTimeBegin ;

    @Schema(description = "End time")
    private String createTimeEnd;

}
