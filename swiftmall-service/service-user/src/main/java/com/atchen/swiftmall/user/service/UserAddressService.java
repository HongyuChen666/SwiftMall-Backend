package com.atchen.swiftmall.user.service;

import com.atchen.swiftmall.model.entity.user.UserAddress;

import java.util.List;

public interface UserAddressService {

    // Retrieve the user's address list
    List<UserAddress> findUserAddressList();

    // Retrieve the shipping address information based on the order id
    UserAddress getUserAddress(Long id);
}
