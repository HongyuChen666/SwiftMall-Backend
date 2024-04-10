package com.atchen.swiftmall.user.mapper;

import com.atchen.swiftmall.model.entity.user.UserAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserAddressMapper {

    // Retrieve the user's address list
    List<UserAddress> findUserAddressList(Long userId);

    // Retrieve the shipping address information based on the order id
    UserAddress getUserAddress(Long id);
}
