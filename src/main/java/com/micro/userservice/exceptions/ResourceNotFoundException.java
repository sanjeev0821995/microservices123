package com.micro.userservice.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    ResourceNotFoundException(){
        super("Resource Not Found");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
