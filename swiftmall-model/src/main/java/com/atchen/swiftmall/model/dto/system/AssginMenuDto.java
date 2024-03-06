package com.atchen.swiftmall.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Schema(description = "Request parameter entity class")
public class AssginMenuDto {

    @Schema(description = "Role ID")
    private Long roleId;

    @Schema(description = "Collection of selected menu IDs")
    private List<Map<String , Number>> menuIdList;

}