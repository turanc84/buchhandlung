package com.example.bestellungservice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BuchNotFoundException extends Exception {

    public BuchNotFoundException() { super("Buch mit dieser Nummer konnte nicht gefunden werden"); }

}
