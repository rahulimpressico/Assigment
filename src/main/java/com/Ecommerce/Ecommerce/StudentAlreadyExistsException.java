package com.Ecommerce.Ecommerce;


public class StudentAlreadyExistsException extends RuntimeException{
    public  StudentAlreadyExistsException(String msg){
        super(msg);
    }

}