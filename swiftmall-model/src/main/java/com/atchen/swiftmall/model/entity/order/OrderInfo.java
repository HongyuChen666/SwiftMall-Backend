package com.atchen.swiftmall.model.entity.order;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Schema(description = "OrderInfo")
public class OrderInfo extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Schema(description = "userId")
	private Long userId;

	@Schema(description = "昵nickName称")
	private String nickName;

	@Schema(description = "orderNo")
	private String orderNo;

	@Schema(description = "couponId")
	private Long couponId;

	@Schema(description = "totalAmount")
	private BigDecimal totalAmount;

	@Schema(description = "coupon")
	private BigDecimal couponAmount;

	@Schema(description = "originalTotalAmount")
	private BigDecimal originalTotalAmount;

	@Schema(description = "feightFee")
	private BigDecimal feightFee;

	@Schema(description = "payType")
	private Integer payType;

	@Schema(description = "orderStatus")
	private Integer orderStatus;

	@Schema(description = "receiverName")
	private String receiverName;

	@Schema(description = "receiverPhone")
	private String receiverPhone;

	@Schema(description = "receiverTagName")
	private String receiverTagName;

	@Schema(description = "receiverProvince")
	private String receiverProvince;

	@Schema(description = "receiverCity")
	private String receiverCity;

	@Schema(description = "receiverDistrict")
	private String receiverDistrict;

	@Schema(description = "receiverAddress")
	private String receiverAddress;

	@Schema(description = "paymentTime")
	private Date paymentTime;

	@Schema(description = "deliveryTime")
	private Date deliveryTime;

	@Schema(description = "receiveTime")
	private Date receiveTime;

	@Schema(description = "remark")
	private String remark;

	@Schema(description = "cancelTime")
	private Date cancelTime;

	@Schema(description = "cancelReason")
	private String cancelReason;

	@Schema(description = "orderItemList")
	private List<OrderItem> orderItemList;

}