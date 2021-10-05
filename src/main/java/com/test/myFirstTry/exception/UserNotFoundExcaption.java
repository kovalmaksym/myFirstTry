package com.test.myFirstTry.exception;

public class UserNotFoundExcaption extends RuntimeException{
    public UserNotFoundExcaption(String msg) {
        super(msg);
    }
}
