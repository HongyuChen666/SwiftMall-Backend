package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.entity.order.OrderStatistics;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderInfoMapper {

    // Calculate the transaction amount for the previous day
    OrderStatistics selectStatisticsByDate(String createDate);
}
