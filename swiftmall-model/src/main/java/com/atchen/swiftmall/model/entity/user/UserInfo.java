package com.atchen.swiftmall.model.entity.user;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "UserEntity")
public class UserInfo extends BaseEntity {

   private static final long serialVersionUID = 1L;

   @Schema(description = "username")
   private String username;

   @Schema(description = "password")
   private String password;

   @Schema(description = "nickName")
   private String nickName;

   @Schema(description = "avatar")
   private String avatar;

   @Schema(description = "sex")
   private Integer sex;

   @Schema(description = "phone")
   private String phone;

   @Schema(description = "memo")
   private String memo;

   @Schema(description = "status")
   private Integer status;

}