package com.example.bestellungservice.shareddomain.dtos;

import lombok.Value;

@Value
public class CreateBuchbestellungResponseDto {

    String bestellnummer;
    String buchNummer;
    String bezahltJa;
    String verfügbarJa;
    String buchstart;
    String buchziel;


    public CreateBuchbestellungResponseDto(String bestellnummer, String buchNummer, String bezahltJa, String verfügbarJa, String buchstart, String buchziel){


        this.bestellnummer = bestellnummer;
        this.buchNummer = buchNummer;
        this.bezahltJa = bezahltJa;
        this.verfügbarJa = verfügbarJa;
        this.buchstart = buchstart;
        this.buchziel = buchziel;


    }





}
