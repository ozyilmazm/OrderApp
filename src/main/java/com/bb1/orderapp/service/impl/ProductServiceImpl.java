package com.bb1.orderapp.service.impl;

import com.bb1.orderapp.dto.ProductDto;
import com.bb1.orderapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    

    @Override
    public List<ProductDto> getAllProducts() {
        ProductDto productDto = new ProductDto();
        return productDto.createMockList(50);
    }
}
