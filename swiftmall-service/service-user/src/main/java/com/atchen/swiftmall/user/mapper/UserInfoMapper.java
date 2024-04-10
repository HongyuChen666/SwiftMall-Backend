package com.atchen.swiftmall.user.mapper;

import com.atchen.swiftmall.model.entity.user.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    // 3 Check the username, ensuring it is not duplicated
    UserInfo selectByUsername(String username);

    // User registration
    void save(UserInfo userInfo);
}
