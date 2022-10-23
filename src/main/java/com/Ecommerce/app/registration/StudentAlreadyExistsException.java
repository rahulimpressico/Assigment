package com.Ecommerce.app.registration;


public class StudentAlreadyExistsException extends RuntimeException{
    public  StudentAlreadyExistsException(String msg){
        super(msg);
    }

}