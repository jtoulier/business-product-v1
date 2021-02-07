package com.reto2.businessproductv1.service;

import com.reto2.businessproductv1.dto.response.ProductResponse;

public interface ProductService {
    ProductResponse findByTioAux(String tioAux);
}
