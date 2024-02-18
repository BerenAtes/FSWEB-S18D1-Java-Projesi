package com.workintech.s18d1.exceptions;


import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BurgerExceptions extends RuntimeException{
    private HttpStatus httpStatus;

    public BurgerExceptions(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus=httpStatus;
    }
}
