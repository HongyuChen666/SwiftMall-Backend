package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.entity.product.ProductDetails;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDetailsMapper {

    // Save product details to "product_details" table
    void save(ProductDetails productDetails);

    // Delete product details based on id: product_details
    ProductDetails findProductDetailsById(Long id);

    // Update "product_details"
    void updateById(ProductDetails productDetails);

    // Delete "product_details" relevant information based on product id
    void deleteByProductId(Long id);
}
