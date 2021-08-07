package com.digital.crud.meetingroom.meetingroom.exeption;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExeption  extends Exception{
     private static final long serialVersionUId= 1L;
     public ResourceNotFoundExeption(String message){
         super(message);
     }
}
