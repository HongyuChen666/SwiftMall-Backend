package com.atchen.swiftmall.utils;

import com.atchen.swiftmall.model.entity.system.SysUser;
import com.atchen.swiftmall.model.entity.user.UserInfo;

public class AuthContextUtil {

    private static final ThreadLocal<UserInfo> userInfoThreadLocal = new ThreadLocal<>() ;


    // Define a static method for storing data
    public static void setUserInfo(UserInfo userInfo) {
        userInfoThreadLocal.set(userInfo);
    }

    // Define a method for retrieving data
    public static UserInfo getUserInfo() {
        return userInfoThreadLocal.get() ;
    }

    // Method for deleting data
    public static void removeUserInfo() {
        userInfoThreadLocal.remove();
    }

    // Create a ThreadLocal Object
    private static final ThreadLocal<SysUser> threadLocal = new ThreadLocal<>();

    // Add data
    public static void set(SysUser sysUser) {
        threadLocal.set(sysUser);
    }

    // Retrieve data
    public static SysUser get() {
        return threadLocal.get();
    }

    // Delete data
    public static void remove() {
        threadLocal.remove();
    }
}
