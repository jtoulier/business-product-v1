package com.reto2.businessproductv1.proxy;

import com.reto2.businessproductv1.dto.response.CustomerProductResponse;
import com.reto2.businessproductv1.dto.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "data-product-v1-product", url = "${data-product-v1.url}")
public interface DataProductV1ProductProxy {

    @GetMapping("/product")
    List<ProductResponse> findAllProducts();


    @GetMapping("/product/{tio-aux}")
    ProductResponse findProductByTioAux(
            @PathVariable("tio-aux") String tioAux
    );

}