package com.reto2.businessproductv1.service;

import com.reto2.businessproductv1.dto.response.CustomerProductResponse;

public interface CustomerProductService {
    CustomerProductResponse findByCicTioAux(String cic, String tioAux);
}
