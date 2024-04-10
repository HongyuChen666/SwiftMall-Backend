package com.atchen.swiftmall.manager.service;

import com.atchen.swiftmall.model.entity.product.ProductSpec;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductSpecService {

    // List
    PageInfo<ProductSpec> findByPage(Integer page, Integer limit);

    // Create
    void save(ProductSpec productSpec);

    // Create
    void updateById(ProductSpec productSpec);

    // Delete
    void deleteById(Long id);

    List<ProductSpec> findAll();
}
