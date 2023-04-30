package com.springboot.valid_exception.service;

import com.springboot.valid_exception.data.dto.ProductDto;
import com.springboot.valid_exception.data.dto.ProductResponseDto;

public interface ProductService {

    ProductResponseDto getProduct(Long number);

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto changetProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;


}
