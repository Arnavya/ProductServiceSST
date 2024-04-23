package com.sst.productservicesst.services;

import com.sst.productservicesst.models.Product;

import java.util.List;

public interface ProductService {
    Product getProuctById(Long id);
    List<Product> getAllProducts();
}
