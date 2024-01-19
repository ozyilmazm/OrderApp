package com.bb1.orderapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    public int Id;
    public String supplierName;
    public String artNumber;
    public int productId;
    public String description;
    public String linkOfProduct;
    public double unitPrice;


    public List<ProductDto> createMockList (int size){

        List<ProductDto> mockListProductDto = new ArrayList<>();

        for (int i=0; i<= size; i++){
            ProductDto mockProductDto = ProductDto.builder()
                    .Id(i)
                    .supplierName("Supplier" + i)
                    .artNumber("ArtNumber" + i)
                    .productId(1000 + i)
                    .description("Description" + i)
                    .linkOfProduct("Link" + i)
                    .unitPrice(10.0 + i)
                    .build();
            mockListProductDto.add(mockProductDto);
        }
        return mockListProductDto;
    }



}
