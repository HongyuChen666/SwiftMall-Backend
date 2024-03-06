package com.atchen.swiftmall.model.entity.system;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema(description = "System menu entity class")
@Data
public class SysMenu extends BaseEntity {

	@Schema(description = "Parent node ID")
	private Long parentId;

	@Schema(description = "Node title")
	private String title;

	@Schema(description = "Component name")
	private String component;

	@Schema(description = "Sort order")
	private Integer sortValue;

	@Schema(description = "Status (0: Forbidden, 1: Normal)")
	private Integer status;

	// 下级列表
	@Schema(description = "Child node")
	private List<SysMenu> children;

}