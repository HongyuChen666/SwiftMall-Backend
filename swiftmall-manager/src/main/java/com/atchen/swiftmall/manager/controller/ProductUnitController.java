package com.atchen.swiftmall.manager.controller;

import com.atchen.swiftmall.manager.service.ProductUnitService;
import com.atchen.swiftmall.model.entity.base.ProductUnit;
import com.atchen.swiftmall.model.vo.common.Result;
import com.atchen.swiftmall.model.vo.common.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/product/productUnit")
public class ProductUnitController {

    @Autowired
    private ProductUnitService productUnitService;

    @GetMapping("/findAll")
    public Result findAll() {
        List<ProductUnit> list = productUnitService.findAll();
        return Result.build(list, ResultCodeEnum.SUCCESS);
    }
}
