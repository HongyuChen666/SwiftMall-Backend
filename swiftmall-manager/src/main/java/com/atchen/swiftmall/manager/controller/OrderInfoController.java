package com.atchen.swiftmall.manager.controller;

import com.atchen.swiftmall.manager.service.OrderInfoService;
import com.atchen.swiftmall.model.dto.order.OrderStatisticsDto;
import com.atchen.swiftmall.model.vo.common.Result;
import com.atchen.swiftmall.model.vo.common.ResultCodeEnum;
import com.atchen.swiftmall.model.vo.order.OrderStatisticsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/admin/order/orderInfo")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    @GetMapping("/getOrderStatisticsData")
    public Result getOrderStatisticsData(OrderStatisticsDto orderStatisticsDto) {
        OrderStatisticsVo orderStatisticsVo = orderInfoService.getOrderStatisticsData(orderStatisticsDto);
        return Result.build(orderStatisticsVo, ResultCodeEnum.SUCCESS);
    }
}
