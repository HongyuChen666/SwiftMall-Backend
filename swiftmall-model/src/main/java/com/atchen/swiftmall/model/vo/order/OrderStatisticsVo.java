package com.atchen.swiftmall.model.vo.order;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "StatisticalResultEntity")
public class OrderStatisticsVo {

    @Schema(description = "dateList")
    private List<String> dateList ;

    @Schema(description = "amountList")
    private List<BigDecimal> amountList ;
}
