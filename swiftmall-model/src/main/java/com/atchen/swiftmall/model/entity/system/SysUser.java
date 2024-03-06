package com.atchen.swiftmall.model.entity.system;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "System user entity class")
public class SysUser extends BaseEntity {

	@Schema(description = "username")
	private String userName;

	@Schema(description = "password")
	private String password;

	@Schema(description = "nickname")
	private String name;

	@Schema(description = "phone")
	private String phone;

	@Schema(description = "avatar")
	private String avatar;

	@Schema(description = "description")
	private String description;

	@Schema(description = "Status (1: Active, 0: Disabled)")
	private Integer status;

}