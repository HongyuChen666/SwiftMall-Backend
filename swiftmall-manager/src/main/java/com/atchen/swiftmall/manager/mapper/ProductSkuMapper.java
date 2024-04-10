package com.atchen.swiftmall.manager.mapper;

import com.atchen.swiftmall.model.entity.product.ProductSku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductSkuMapper {

    // Save the SKU information to the "product_sku" table
    void save(ProductSku productSku);

    // Query SKU information based on id: product_sku
    List<ProductSku> findProductSkuByProductId(Long id);

    // Update "product_sku"
    void updateById(ProductSku productSku);

    // Delete "product_sku" relevant information based on product id
    void deleteByProductId(Long id);
}
