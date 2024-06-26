package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.entity.product.ProductSpec;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductSpecMapper {

    // List
    List<ProductSpec> findByPage();

    // Create
    void save(ProductSpec productSpec);

    // Update
    void update(ProductSpec productSpec);

    // Delete
    void delete(Long id);

    List<ProductSpec> findAll();

}
