package com.atchen.swiftmall.model.entity.product;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "ProductSpecificationEntity")
public class ProductSpec extends BaseEntity {

	@Schema(description = "specName")
	private String specName;

	@Schema(description = "specValue")
	private String specValue;

}