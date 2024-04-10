package com.atchen.swiftmall.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "Request parameter entity class")
public class AssginRoleDto {

    @Schema(description = "User ID")
    private Long userId;

    @Schema(description = "List collection of role IDs")
    private List<Long> roleIdList;

}
