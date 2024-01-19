package com.bb1.orderapp.controller;

import com.bb1.orderapp.dto.ProductDto;
import com.bb1.orderapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController  {
    private final ProductService service;

    @GetMapping
    public List<ProductDto> getAllProducts(){
            return service.getAllProducts();
    }
}
