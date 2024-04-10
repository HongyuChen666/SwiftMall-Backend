package com.atchen.swiftmall.model.dto.product;

import com.atchen.swiftmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "CommoditySearchCriteriaEntity")
public class ProductDto extends BaseEntity {

    @Schema(description = "brandId")
    private Long brandId;

    @Schema(description = "PrimaryCategoryId")
    private Long category1Id;

    @Schema(description = "SecondaryCategoryId")
    private Long category2Id;

    @Schema(description = "TertiaryCategoryId")
    private Long category3Id;

}
