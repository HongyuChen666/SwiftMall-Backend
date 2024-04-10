package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.entity.product.Category;
import com.atchen.swiftmall.model.vo.product.CategoryExcelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    // Query subcategories
    List<Category> selectCategoryByParentId(Long id);

    // Determine if each category has subcategories
    int selectCountByParentId(Long id);

    // Query all categories
    List<Category> findAll();

    // Save to the database
    void batchInsert(List<CategoryExcelVo> categoryList);
}
