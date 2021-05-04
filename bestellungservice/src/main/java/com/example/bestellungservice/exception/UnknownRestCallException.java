package com.example.bestellungservice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FAILED_DEPENDENCY)
public class UnknownRestCallException extends Exception {

    public UnknownRestCallException() {

        super("Nicht identifizierbarer Fehler Unbekannt");
    }
}
