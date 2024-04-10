package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.entity.product.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {

    // List
    List<Brand> findByPage();

    // Create
    void save(Brand brand);

    // Update
    void updateById(Brand brand);


    // Delete
    void deleteById(Long id);

}
