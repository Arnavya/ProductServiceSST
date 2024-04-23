package com.sst.productservicesst.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor//It creates custom constrictor so default constructor wont be available
@NoArgsConstructor//Using this defaut constructor will be available. Product p1 = new Product();
public class Product {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Category category;
    private String image;
    /*
    Product(Long id , String title,String description,Double price,Category category,String image){
        this.id = id;
        this.title = title;//.....
        }
        //Instead of this use Lombok--  @AllArgsConstructor
     */
}
