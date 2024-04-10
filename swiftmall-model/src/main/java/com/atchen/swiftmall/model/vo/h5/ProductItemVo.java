package com.atchen.swiftmall.model.vo.h5;

import com.alibaba.fastjson.JSONArray;
import com.atchen.swiftmall.model.entity.product.Product;
import com.atchen.swiftmall.model.entity.product.ProductSku;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Schema(description = "ProductDetailObject")
public class ProductItemVo {

   @Schema(description = "productSku")
   private ProductSku productSku;

   @Schema(description = "productInfo")
   private Product product;

   @Schema(description = "sliderUrlList")
   private List<String> sliderUrlList;

   @Schema(description = "detailsImageUrlList")
   private List<String> detailsImageUrlList;

   @Schema(description = "specValueList")
   private JSONArray specValueList;

   @Schema(description = "ProductSpecificationToSkuIdMappingInfo")
   private Map<String,Object> skuSpecValueMap;

}