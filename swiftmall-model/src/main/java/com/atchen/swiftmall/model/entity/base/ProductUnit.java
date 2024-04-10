package com.atchen.swiftmall.model.entity.base;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "ProductUnitEntity")
public class ProductUnit extends BaseEntity {

	@Schema(description = "name")
	private String name;

}