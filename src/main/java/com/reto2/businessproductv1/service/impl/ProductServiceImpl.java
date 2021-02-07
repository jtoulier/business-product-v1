package com.reto2.businessproductv1.service.impl;

import com.reto2.businessproductv1.dto.response.ProductResponse;
import com.reto2.businessproductv1.proxy.DataProductV1Proxy;
import com.reto2.businessproductv1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private DataProductV1Proxy dataProductV1Proxy;

    @Override
    public ProductResponse findByTioAux(String tioAux) {
        return dataProductV1Proxy.findProductByTioAux(tioAux);
    }
}
