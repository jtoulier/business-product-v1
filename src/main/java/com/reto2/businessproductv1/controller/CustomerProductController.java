package com.reto2.businessproductv1.controller;

import com.reto2.businessproductv1.dto.response.ProductResponse;
import com.reto2.businessproductv1.proxy.DataProductV1Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business-product-v1")
public class CustomerProductController {
    @Autowired
    private DataProductV1Proxy dataProductV1Proxy;

    @GetMapping("/product/{tio-aux}")
    public ResponseEntity<ProductResponse> findByTioAux(
        @PathVariable("tio-aux") String tioAux
    ) {

        ProductResponse productResponse = dataProductV1Proxy.findByTioAux(tioAux);

        return new ResponseEntity(productResponse, HttpStatus.OK);
    }
}
