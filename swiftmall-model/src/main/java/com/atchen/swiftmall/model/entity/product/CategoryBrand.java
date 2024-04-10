package com.atchen.swiftmall.model.entity.product;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "CategoryBrandEntity")
public class CategoryBrand extends BaseEntity {

	@Schema(description = "BrandId")
	private Long brandId;

	@Schema(description = "CategoryId")
	private Long categoryId;

	@Schema(description = "CategoryName" , required = false)
	private String categoryName;

	@Schema(description = "BrandName" , required = false)
	private String brandName;

	@Schema(description = "BrandLogo" , required = false)
	private String logo;

}