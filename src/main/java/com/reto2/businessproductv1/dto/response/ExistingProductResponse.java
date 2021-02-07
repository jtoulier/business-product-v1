package com.reto2.businessproductv1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExistingProductResponse {
    private String cic;
    private String tioAux;
    private String description;
    private String details;
}
