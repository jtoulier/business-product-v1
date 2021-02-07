package com.reto2.businessproductv1.controller;

import com.reto2.businessproductv1.dto.response.CustomerProductResponse;
import com.reto2.businessproductv1.service.CustomerProductService;
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
    private CustomerProductService customerProductService;

    @GetMapping("/customer/{cic}/product/{tio-aux}")
    public ResponseEntity<CustomerProductResponse> findByCicTioAux (
            @PathVariable("cic") String cic,
            @PathVariable("tio-aux") String tioAux
    ) {
        CustomerProductResponse customerProductResponse = customerProductService.findByCicTioAux(cic, tioAux);

        return new ResponseEntity(customerProductResponse, HttpStatus.OK);
    }
}
