package com.Akshay.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{
    public  UserNotFoundException(Long id){
        super("could not found the User "+id);
    }
}
