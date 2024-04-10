package com.atchen.swiftmall.model.dto.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "ProductListSearchCriteriaEntity")
public class ProductSkuDto {

    @Schema(description = "keyword")
    private String keyword;

    @Schema(description = "brand id")
    private Long brandId;

    @Schema(description = "Primary Category Id")
    private Long category1Id;

    @Schema(description = "SecondaryCategoryId")
    private Long category2Id;

    @Schema(description = "TertiaryCategoryId")
    private Long category3Id;

    @Schema(description = "Sort (Comprehensive: 1 Price Ascending: 2 Price Descending: 3)")
    private Integer order = 1;

}