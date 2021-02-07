package com.reto2.businessproductv1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProductResponse {
    private String cic;
    private String tioAux;
    private String details;
}
