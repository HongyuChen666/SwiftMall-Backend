package com.atchen.swiftmall.manager.service;

import com.atchen.swiftmall.model.dto.order.OrderStatisticsDto;
import com.atchen.swiftmall.model.vo.order.OrderStatisticsVo;

public interface OrderInfoService {
    OrderStatisticsVo getOrderStatisticsData(OrderStatisticsDto orderStatisticsDto);
}
