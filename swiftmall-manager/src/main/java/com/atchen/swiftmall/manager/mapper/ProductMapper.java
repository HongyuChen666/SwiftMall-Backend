package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.dto.product.ProductDto;
import com.atchen.swiftmall.model.entity.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    // List and page
    List<Product> findByPage(ProductDto productDto);

    // Save product information to the "product" table
    void save(Product product);

    // Query product information based on id: product
    Product findProductById(Long id);

    // Update "product
    void updateById(Product product);

    // Delete "product" relevant information based on product id
    void deleteById(Long id);
}
