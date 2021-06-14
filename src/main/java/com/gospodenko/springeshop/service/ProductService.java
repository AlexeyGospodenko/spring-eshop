package com.gospodenko.springeshop.service;

import com.gospodenko.springeshop.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAll();
    void AddToUserBucket(Long productId, String username);
    void addProduct(ProductDTO dto);
}
