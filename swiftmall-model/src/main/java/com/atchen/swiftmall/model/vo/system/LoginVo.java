package com.atchen.swiftmall.model.vo.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Login success response result entity class")
public class LoginVo {

    @Schema(description = "token")
    private String token ;

    @Schema(description = "Refresh token, can be empty")
    private String refresh_token ;

}
