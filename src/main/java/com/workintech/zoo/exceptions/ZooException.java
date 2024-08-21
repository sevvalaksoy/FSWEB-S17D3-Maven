package com.workintech.zoo.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Getter
public class ZooException extends RuntimeException{
    private HttpStatus status;
    public ZooException(String message, HttpStatus status){
        super(message);
        this.status = status;
    }

    public HttpStatus getHttpStatus(){
        return status;
    }

    public void setHttpStatus(HttpStatus status){
        this.status = status;
    }
}
