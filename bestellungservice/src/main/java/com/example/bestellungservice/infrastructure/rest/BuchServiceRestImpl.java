package com.example.bestellungservice.infrastructure.rest;


import com.example.bestellungservice.exception.BuchNotFoundException;
import com.example.bestellungservice.exception.UnknownRestCallException;
import com.example.bestellungservice.shareddomain.dtos.BuchResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class BuchServiceRestImpl implements BuchServiceRest{

    @Override
    public BuchResponseDto getBuch(String buchnummer) throws BuchNotFoundException, UnknownRestCallException{
        try {
            RestTemplate restTemplate = new RestTemplate();
            String resourceUrl = "http://localhost:8081/buch/" + buchnummer;
            System.out.println("BuchNummer Url: " + resourceUrl);
            return restTemplate.getForObject(resourceUrl, BuchResponseDto.class);
        }catch (HttpClientErrorException | HttpServerErrorException e){
            System.out.println("BuchServiceRestImpl Error!");
            System.out.println(e.getMessage());
            System.out.println();
            if(HttpStatus.NOT_FOUND.equals(e.getStatusCode())){
                throw new BuchNotFoundException();
            }
            else {
                throw new UnknownRestCallException();
            }

        }catch (Exception e){

            e.printStackTrace();
            return null;
        }




    }






}
