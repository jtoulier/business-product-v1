package com.reto2.businessproductv1.service.impl;

import com.reto2.businessproductv1.dto.response.CustomerProductResponse;
import com.reto2.businessproductv1.proxy.DataProductV1Proxy;
import com.reto2.businessproductv1.service.CustomerProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerProductServiceImpl implements CustomerProductService {
    @Autowired
    private DataProductV1Proxy dataProductV1Proxy;


    @Override
    public CustomerProductResponse findByCicTioAux(String cic, String tioAux) {
        return dataProductV1Proxy.findCustomerProductById(cic, tioAux);
    }
}
