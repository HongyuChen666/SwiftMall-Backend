package com.atchen.swiftmall.model.vo.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Response result entity class")
public class Result<T> {

    @Schema(description = "status code")
    private Integer code;

    @Schema(description = "Response message")
    private String message;

    @Schema(description = "data")
    private T data;

    private Result() {}

    public static <T> Result<T> build(T body, Integer code, String message) {
        Result<T> result = new Result<>();
        result.setData(body);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    // Constructing a Result object through enumeration
    public static <T> Result build(T body , ResultCodeEnum resultCodeEnum) {
        return build(body , resultCodeEnum.getCode() , resultCodeEnum.getMessage()) ;
    }

}
