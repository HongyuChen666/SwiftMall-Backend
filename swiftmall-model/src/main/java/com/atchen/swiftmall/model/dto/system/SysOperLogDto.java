package com.atchen.swiftmall.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "RequestParameterEntity")
public class SysOperLogDto {

    @Schema(description = "moduleName")
    private String title;

    @Schema(description = "OperationUsername")
    private String operName;

    @Schema(description = "startTime")
    private String createTimeBegin;

    @Schema(description = "endTime")
    private String createTimeEnd;

}
