package com.workintech.s18d1.util;

import com.workintech.s18d1.exceptions.BurgerExceptions;
import org.springframework.http.HttpStatus;

public class BurgerValidation {
    public static void checkName(String name){
        if (name==null || name.isEmpty()){
            throw new BurgerExceptions("name cannot be null or empty", HttpStatus.BAD_REQUEST);
        }
    }
}
