package com.atchen.swiftmall.model.entity.product;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "BrandEntity")
public class Brand extends BaseEntity {

	@Schema(description = "BrandName")
	private String name;

	@Schema(description = "BrandLogo")
	private String logo;

}