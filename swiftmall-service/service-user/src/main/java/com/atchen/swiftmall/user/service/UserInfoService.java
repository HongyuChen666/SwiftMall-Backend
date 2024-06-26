package com.atchen.swiftmall.user.service;

import com.atchen.swiftmall.model.dto.h5.UserLoginDto;
import com.atchen.swiftmall.model.dto.h5.UserRegisterDto;
import com.atchen.swiftmall.model.vo.h5.UserInfoVo;

public interface UserInfoService {

    // User registration
    void register(UserRegisterDto userRegisterDto);

    // User login
    String login(UserLoginDto userLoginDto);

    // Retrieve information about the currently logged-in user
    UserInfoVo getCurrentUserInfo(String token);
}
