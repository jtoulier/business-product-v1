package com.reto2.businessproductv1.controller;

import com.reto2.businessproductv1.dto.response.ProductsForCustomerResponse;
import com.reto2.businessproductv1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business-product-v1")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/{cic}/products-for-customer")
    public ResponseEntity<ProductsForCustomerResponse> getProductsForCustomer(
            @PathVariable("cic") String cic
    ) {
        return new ResponseEntity(customerService.getProductsForCustomer(cic), HttpStatus.OK);
    }
}
