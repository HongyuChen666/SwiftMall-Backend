package com.atchen.swiftmall.model.vo.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Verification code response result entity class")
public class ValidateCodeVo {

    @Schema(description = "Verification code key")
    private String codeKey ;

    @Schema(description = "Verification code value")
    private String codeValue ;

}