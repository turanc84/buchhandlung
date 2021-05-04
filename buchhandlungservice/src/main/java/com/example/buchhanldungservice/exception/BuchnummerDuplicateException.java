package com.example.buchhanldungservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class BuchnummerDuplicateException extends Throwable {
    public BuchnummerDuplicateException() {
        super("Diese Buchnummer existiert bereits");
    }
}
