package com.atchen.swiftmall.model.vo.h5;

import com.atchen.swiftmall.model.entity.product.Category;
import com.atchen.swiftmall.model.entity.product.ProductSku;
import lombok.Data;

import java.util.List;

@Data
public class IndexVo {

    private List<Category> categoryList ;
    private List<ProductSku> productSkuList ;

}