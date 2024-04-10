package com.atchen.swiftmall.model.vo.h5;

import com.atchen.swiftmall.model.entity.order.OrderItem;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "TradeObeject")
public class TradeVo {

    @Schema(description = "totalAmount")
    private BigDecimal totalAmount;

    @Schema(description = "orderItemList")
    private List<OrderItem> orderItemList;

}