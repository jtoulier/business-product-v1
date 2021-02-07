package com.reto2.businessproductv1.proxy;

import com.reto2.businessproductv1.dto.response.CustomerProductResponse;
import com.reto2.businessproductv1.dto.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "data-product-v1-customer-product", url = "${data-product-v1.url}")
public interface DataProductV1CustomerProductProxy {

    @GetMapping("/customer/{cic}/product/{tio-aux}")
    CustomerProductResponse findCustomerProductById(
            @PathVariable("cic") String cic,
            @PathVariable("tio-aux") String tioAux
    );

    @GetMapping("/customer/{cic}/product")
    List<CustomerProductResponse> findCustomerProductsByCic(
            @PathVariable("cic") String cic
    );
}