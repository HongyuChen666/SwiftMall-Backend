package com.atchen.swiftmall.model.dto.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "UserLoginRequestParameters")
public class UserLoginDto {

    @Schema(description = "username")
    private String username ;

    @Schema(description = "password")
    private String password ;
}