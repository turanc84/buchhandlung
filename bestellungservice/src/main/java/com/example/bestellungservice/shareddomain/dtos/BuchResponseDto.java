package com.example.bestellungservice.shareddomain.dtos;


import lombok.Data;

@Data
public class BuchResponseDto {

    private String buchNummer;
    private String buchName;


    public BuchResponseDto(String buchNummer, String buchName){

        this.buchName = buchName;
        this.buchNummer = buchNummer;

    }

    public String getBuchNummer() {
        return buchNummer;
    }

    public String getBuchName() {
        return buchName;
    }
}
