package com.atchen.swiftmall.model.entity.user;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "UserAddressEntity")
public class UserAddress extends BaseEntity {

   private static final long serialVersionUID = 1L;

   @Schema(description = "userId")
   private Long userId;

   @Schema(description = "name")
   private String name;

   @Schema(description = "phone")
   private String phone;

   @Schema(description = "tagName")
   private String tagName;

   @Schema(description = "provinceCode")
   private String provinceCode;

   @Schema(description = "cityCode")
   private String cityCode;

   @Schema(description = "districtCode")
   private String districtCode;

   @Schema(description = "address")
   private String address;

   @Schema(description = "fullAddress")
   private String fullAddress;

   @Schema(description = "isDefaultAddress")
   private Integer isDefault;

}