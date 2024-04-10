package com.atchen.swiftmall.model.entity.product;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "ProductEntity")
public class Product extends BaseEntity {

	@Schema(description = "ProductName")
	private String name;

	@Schema(description = "BrandId")
	private Long brandId;

	@Schema(description = "PrimaryCategoryId")
	private Long category1Id;

	@Schema(description = "SecondaryCategoryId")
	private Long category2Id;

	@Schema(description = "TertiaryCategoryId")
	private Long category3Id;

	@Schema(description = "Unit")
	private String unitName;

	@Schema(description = "sliderUrls")
	private String sliderUrls;

	@Schema(description = "ProductSpecificationValuesJson")
	private String specValue;

	@Schema(description = "status")
	private Integer status;

	@Schema(description = "auditStatus")
	private Integer auditStatus;

	@Schema(description = "auditMessage")
	private String auditMessage;

	@Schema(description = "BrandName")
	private String brandName;

	@Schema(description = "PrimaryCategoryName")
	private String category1Name;

	@Schema(description = "SecondaryCategoryName")
	private String category2Name;

	@Schema(description = "TertiaryCategoryName")
	private String category3Name;

	@Schema(description = "productSkuList")
	private List<ProductSku> productSkuList;

	@Schema(description = "ImageDetailList")
	private String detailsImageUrls;

}