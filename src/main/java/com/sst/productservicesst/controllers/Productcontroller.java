package com.sst.productservicesst.controllers;

import com.sst.productservicesst.dtos.ExceptionDto;
import com.sst.productservicesst.dtos.FakeStoreProductDto;
import com.sst.productservicesst.models.Product;
import com.sst.productservicesst.services.FakeStoreProductService;
import com.sst.productservicesst.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController means this controller is capable to host HTTP API's
@RestController
@RequestMapping("/products")
//This mean localhost:8080/products -> will reach to -> ProductController
public class Productcontroller {//Controller is just like "WAITER"
    private ProductService productService;
    public Productcontroller(FakeStoreProductService fakeStoreProductService) {
        this.productService = fakeStoreProductService;
    }
    //localhost:8080/products/10;
    @GetMapping("/{id}")//End Point
    public Product getProductById(@PathVariable("id") Long id){
        //If you want to pass the variable which is coming in the URL path use @PathVariable if you want to set that variable into input parameter
        //ResponseEntity--Instead of returning the only object in the data in the output,we will return multiple things.For example if the API call is successfull will return status as 200, If the API is getting wrong input we will return status 404
        //throw new RuntimeException("Something went wrong");
//        ResponseEntity<Product> responseEntity = null;
//        Product product = null;
//        try{
//            product = productService.getProuctById(id);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);//If there is no error we will return the product object and the status code ok(200)
//            return responseEntity;
//        }
//        catch (RuntimeException exception){
//            ExceptionDto dto = new ExceptionDto();
//            dto.setMessage("Something went wrong");
//            dto.setResolution("Do Nothing");
//            ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto,HttpStatus.BAD_REQUEST);
//            return response;//If we get an exception return Not found error code without the product object(error code 404)
//        }
        return productService.getProuctById(id);
    }

    //localhost:8080/products
    @GetMapping//End Point
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
