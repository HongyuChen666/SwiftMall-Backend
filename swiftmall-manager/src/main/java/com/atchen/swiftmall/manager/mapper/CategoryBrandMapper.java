package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.dto.product.CategoryBrandDto;
import com.atchen.swiftmall.model.entity.product.Brand;
import com.atchen.swiftmall.model.entity.product.CategoryBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryBrandMapper {

    // Conditional pagination query for category brands
    List<CategoryBrand> findByPage(CategoryBrandDto categoryBrandDto);

    // Create
    void save(CategoryBrand categoryBrand);

    // Update
    void updateById(CategoryBrand categoryBrand);

    // Delete
    void deleteById(Long id);

    // Query corresponding brand data based on category ID
    List<Brand> findBrandByCategoryId(Long categoryId);
}
