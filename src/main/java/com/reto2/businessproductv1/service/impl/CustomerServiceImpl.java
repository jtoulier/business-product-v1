package com.reto2.businessproductv1.service.impl;

import com.reto2.businessproductv1.dto.response.CustomerProductResponse;
import com.reto2.businessproductv1.dto.response.ExistingProductResponse;
import com.reto2.businessproductv1.dto.response.ProductResponse;
import com.reto2.businessproductv1.dto.response.ProductsForCustomerResponse;
import com.reto2.businessproductv1.proxy.DataProductV1Proxy;
import com.reto2.businessproductv1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private DataProductV1Proxy dataProductV1Proxy;

    @Override
    public ProductsForCustomerResponse getProductsForCustomer(String cic) {
        // obtener todos los productos
        List<ProductResponse> allProducts = dataProductV1Proxy.findAllProducts();

        // dado el cic obtener los customer-product
        List<CustomerProductResponse> customerProducts = dataProductV1Proxy.findCustomerProductsByCic(cic);

        // preparar la respuesta
        List<ExistingProductResponse> currentCustomerProducts = new ArrayList<>();
        List<ProductResponse> newCustomerProducts = new ArrayList<>();

        if (allProducts != null) {
            for (ProductResponse productToSearch : allProducts) {
                // si el producto ya lo tiene el cliente
                //   agregarlo a current
                // caso contrario
                //   agregarlo a new
                // fin si
                CustomerProductResponse foundProduct = customerProducts
                                                .stream()
                                                .filter(
                                                        x ->
                                                        productToSearch.getTioAux().equals(x.getTioAux())
                                                )
                                                .findAny()
                                                .orElse(null);

                if (foundProduct != null) {
                    // convertir el producto
                    ExistingProductResponse existingProductResponse = new ExistingProductResponse();

                    existingProductResponse.setCic(cic);
                    existingProductResponse.setTioAux(foundProduct.getTioAux());
                    existingProductResponse.setDescription(productToSearch.getDescription());
                    existingProductResponse.setDetails(foundProduct.getDetails());

                    currentCustomerProducts.add(existingProductResponse);
                }
                else {
                    newCustomerProducts.add(productToSearch);
                }
            }
        }

        ProductsForCustomerResponse productsForCustomerResponse = new ProductsForCustomerResponse();

        productsForCustomerResponse.setExistingProductResponseList(currentCustomerProducts);
        productsForCustomerResponse.setNewProductResponseList(newCustomerProducts);

        return productsForCustomerResponse;
    }
}