package com.reto2.businessproductv1.proxy;

import com.reto2.businessproductv1.dto.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "data-product-v1", url="http://localhost:8082/data-product-v1")
public interface DataProductV1Proxy {
    @RequestMapping(method = RequestMethod.GET, value = "/product/{tio-aux}")
    ProductResponse findByTioAux(@PathVariable("tio-aux") String tioAux);
}
