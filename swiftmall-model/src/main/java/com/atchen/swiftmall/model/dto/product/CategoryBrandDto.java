package com.atchen.swiftmall.model.dto.product;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "SearchCriteriaEntity")
public class CategoryBrandDto {

	@Schema(description = "brandId")
	private Long brandId;

	@Schema(description = "categoryId")
	private Long categoryId;

}