package com.reto2.businessproductv1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsForCustomerResponse {
    private List<ProductResponse> newProductResponseList;
    private List<ExistingProductResponse> existingProductResponseList;
}
