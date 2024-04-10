package com.atchen.swiftmall.model.entity.product;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import lombok.Data;

@Data
public class ProductDetails extends BaseEntity {

	private Long productId;
	private String imageUrls;

}