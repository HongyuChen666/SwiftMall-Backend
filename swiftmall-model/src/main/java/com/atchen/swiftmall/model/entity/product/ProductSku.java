package com.atchen.swiftmall.model.entity.product;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "ProductSku")
public class ProductSku extends BaseEntity {

	@Schema(description = "skuCode")
	private String skuCode;

	@Schema(description = "skuName")
	private String skuName;

	@Schema(description = "productId")
	private Long productId;

	@Schema(description = "thumbImagePath")
	private String thumbImg;

	@Schema(description = "salePrice")
	private BigDecimal salePrice;

	@Schema(description = "marketPrice")
	private BigDecimal marketPrice;

	@Schema(description = "costPrice")
	private BigDecimal costPrice;

	@Schema(description = "stockNum")
	private Integer stockNum;

	@Schema(description = "saleNum")
	private Integer saleNum;

	@Schema(description = "skuSpecJson")
	private String skuSpec;

	@Schema(description = "weight")
	private String weight;

	@Schema(description = "volume")
	private String volume;

	@Schema(description = "status")
	private Integer status;

}