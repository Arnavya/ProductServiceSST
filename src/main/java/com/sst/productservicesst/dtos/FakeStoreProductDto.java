package com.sst.productservicesst.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    //In the ProductDto you will only have the attributes that you want ti expose,that you want
    //to return to the clint.
    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}
