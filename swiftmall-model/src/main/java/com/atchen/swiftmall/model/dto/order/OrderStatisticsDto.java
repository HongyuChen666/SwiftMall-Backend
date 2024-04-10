package com.atchen.swiftmall.model.dto.order;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "SearchConditionEntityClass")
public class OrderStatisticsDto {

    @Schema(description = "startTime")
    private String createTimeBegin;

    @Schema(description = "endTime")
    private String createTimeEnd;

}
