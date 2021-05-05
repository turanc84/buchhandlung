package com.example.bestellungservice.infrastructure.rest;

import com.example.bestellungservice.exception.BuchNotFoundException;
import com.example.bestellungservice.exception.UnknownRestCallException;
import com.example.bestellungservice.shareddomain.dtos.BuchResponseDto;

public interface BuchServiceRest {


    BuchResponseDto getBuch(String buchnummer) throws BuchNotFoundException, UnknownRestCallException, BuchNotFoundException, UnknownRestCallException;



}
