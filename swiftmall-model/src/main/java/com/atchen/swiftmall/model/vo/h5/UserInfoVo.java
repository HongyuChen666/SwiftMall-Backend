package com.atchen.swiftmall.model.vo.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "UserObject")
public class UserInfoVo {

   @Schema(description = "nickName")
   private String nickName;

   @Schema(description = "avatar")
   private String avatar;

}