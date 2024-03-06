package com.atchen.swiftmall.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "User login request parameters")
public class LoginDto {

    @Schema(description = "Username")
    private String userName ;

    @Schema(description = "Password")
    private String password ;

    @Schema(description = "Submit verification code")
    private String captcha ;

    @Schema(description = "verification code key")
    private String codeKey ;

}
