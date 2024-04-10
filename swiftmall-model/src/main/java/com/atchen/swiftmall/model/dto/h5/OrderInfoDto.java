package com.atchen.swiftmall.model.dto.h5;

import com.atchen.gomall.model.entity.order.OrderItem;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderInfoDto {

    private Long userAddressId;

    private BigDecimal feightFee;

    private String remark;

    private List<OrderItem> orderItemList;
}