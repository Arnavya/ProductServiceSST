package com.sst.productservicesst.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
public class ProductNotFoundException extends RuntimeException{
    //extend Exception class if looking for checked exception - warning will be given before running the code
    //extend RuntimeException class if looking for unchecked exception - no warning given (exception will be shown at runtime).Eg int x=1/0;(no error will be shown during compilation)
    private Long id;
    public ProductNotFoundException(Long id,String message){
        super(message);
        this.id = id;
    }
}
