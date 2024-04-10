package com.atchen.swiftmall.manager.service.impl;

import com.atchen.swiftmall.manager.mapper.ProductUnitMapper;
import com.atchen.swiftmall.manager.service.ProductUnitService;
import com.atchen.swiftmall.model.entity.base.ProductUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductUnitServiceImpl implements ProductUnitService {

    @Autowired
    private ProductUnitMapper productUnitMapper;

    @Override
    public List<ProductUnit> findAll() {
        return productUnitMapper.findAll();
    }
}
