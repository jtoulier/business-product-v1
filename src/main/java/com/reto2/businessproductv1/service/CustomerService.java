package com.reto2.businessproductv1.service;

import com.reto2.businessproductv1.dto.response.ProductsForCustomerResponse;

public interface CustomerService {
    ProductsForCustomerResponse getProductsForCustomer(String cic);
}
