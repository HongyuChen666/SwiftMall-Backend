package com.atchen.swiftmall.model.entity.order;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "OrderLogEntity")
public class OrderLog extends BaseEntity {

   private static final long serialVersionUID = 1L;

   @Schema(description = "orderId")
   private Long orderId;

   @Schema(description = "Operator: User; System; Backend Administrator")
   private String operateUser;

   @Schema(description = "orderStatus")
   private Integer processStatus;

   @Schema(description = "note")
   private String note;

}