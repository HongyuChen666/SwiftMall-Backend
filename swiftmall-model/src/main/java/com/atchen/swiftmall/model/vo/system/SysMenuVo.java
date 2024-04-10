package com.atchen.swiftmall.model.vo.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "System menu response result entity class")
public class SysMenuVo {

    @Schema(description = "System menu title")
    private String title;

    @Schema(description = "System menu name")
    private String name;

    @Schema(description = "List of submenus for the system menu")
    private List<SysMenuVo> children;

}