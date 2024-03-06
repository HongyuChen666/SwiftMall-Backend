package com.atchen.swiftmall.model.vo.common;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {

    SUCCESS(200 , "Operation successful") ,
    LOGIN_ERROR(201 , "Username or password incorrect"),
    VALIDATECODE_ERROR(202 , "Incorrect verification code") ,
    LOGIN_AUTH(208 , "User not logged in"),
    USER_NAME_IS_EXISTS(209 , "Username already exists"),
    SYSTEM_ERROR(9999 , "There is an issue with your network. Please try again later"),
    NODE_ERROR( 217, "Cannot delete this node as it has child nodes"),
    DATA_ERROR(204, "Data error"),
    ACCOUNT_STOP( 216, "Account has been disabled"),


    ;

    private Integer code ;
    private String message ;

    private ResultCodeEnum(Integer code , String message) {
        this.code = code ;
        this.message = message ;
    }

}
