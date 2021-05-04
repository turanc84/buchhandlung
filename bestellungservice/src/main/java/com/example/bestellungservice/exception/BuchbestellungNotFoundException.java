package com.example.bestellungservice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BuchbestellungNotFoundException extends Exception {

    public BuchbestellungNotFoundException(){

        super("Buchbestellung mit dieser Nummer nicht gefunden");
    }

}
