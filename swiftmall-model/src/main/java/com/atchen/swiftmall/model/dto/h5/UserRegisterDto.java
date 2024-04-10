package com.atchen.swiftmall.model.dto.h5;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description="RegistrationObject")
public class UserRegisterDto {

    @Schema(description = "username")
    private String username;

    @Schema(description = "password")
    private String password;

    @Schema(description = "nicknName")
    private String nickName;

    @Schema(description = "code")
    private String code ;

}