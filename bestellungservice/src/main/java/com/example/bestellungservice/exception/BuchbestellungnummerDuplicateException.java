package com.example.bestellungservice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class BuchbestellungnummerDuplicateException extends Exception {

    public BuchbestellungnummerDuplicateException(){

        super("Buchbestellungnummer existiert bereits");

    }
}
