package com.atchen.swiftmall.manager.service;

import com.atchen.swiftmall.model.entity.product.Brand;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BrandService {

    // List
    PageInfo<Brand> findByPage(Integer page, Integer limit);

    // Create
    void save(Brand brand);

    // Update
    void updateById(Brand brand);

    // Delete
    void deleteById(Long id);

    // Query all brand
    List<Brand> findAll();
}
