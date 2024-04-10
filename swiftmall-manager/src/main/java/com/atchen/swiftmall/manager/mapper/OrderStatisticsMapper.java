package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.dto.order.OrderStatisticsDto;
import com.atchen.swiftmall.model.entity.order.OrderStatistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderStatisticsMapper {

    // Add the post-processed data to the statistics result table
    void insert(OrderStatistics orderStatistics);

    // Query statistical result data based on DTO conditions and return a list collection
    List<OrderStatistics> selectList(OrderStatisticsDto orderStatisticsDto);
}
