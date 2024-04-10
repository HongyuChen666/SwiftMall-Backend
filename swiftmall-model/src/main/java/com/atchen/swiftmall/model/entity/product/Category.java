package com.atchen.swiftmall.model.entity.product;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "CategoryEntity")
public class Category extends BaseEntity {

	@Schema(description = "CategoryName")
	private String name;

	@Schema(description = "CategoryImageURL")
	private String imageUrl;

	@Schema(description = "ParentNodeId")
	private Long parentId;

	@Schema(description = "CategoryStatus: Display [0 - Not Displayed, 1 - Displayed]")
	private Integer status;

	@Schema(description = "orderNum")
	private Integer orderNum;

	@Schema(description = "HasChildNodes")
	private Boolean hasChildren;

	@Schema(description = "ChildNodeList")
	private List<Category> children;

}