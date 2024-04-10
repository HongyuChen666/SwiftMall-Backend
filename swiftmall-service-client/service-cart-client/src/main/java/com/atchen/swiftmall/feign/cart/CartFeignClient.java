package com.atchen.swiftmall.feign.cart;

import com.atchen.swiftmall.model.entity.h5.CartInfo;
import com.atchen.swiftmall.model.vo.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "service-cart")
public interface CartFeignClient {

    @GetMapping("api/order/cart/auth/deleteChecked")
    public Result deleteChecked();

    @GetMapping(value = "api/order/cart/auth/getAllCkecked")
    public List<CartInfo> getAllChecked();

}
