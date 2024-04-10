package com.atchen.swiftmall.model.entity.order;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "OrderItemEntity")
public class OrderItem extends BaseEntity {

   private static final long serialVersionUID = 1L;

   @Schema(description = "orderId")
   private Long orderId;

   @Schema(description = "skuId")
   private Long skuId;

   @Schema(description = "skuName")
   private String skuName;

   @Schema(description = "skuImage")
   private String thumbImg;

   @Schema(description = "skuPrice")
   private BigDecimal skuPrice;

   @Schema(description = "skuNum")
   private Integer skuNum;

}