package com.example.buchhanldungservice.api.rest.dtos;


import lombok.Value;

@Value
public class CreateBuchDto {


    private String buchNummer;
    private String buchName;



    public CreateBuchDto(String buchNummer, String buchName){


        this.buchNummer = buchNummer;
        this.buchName = buchName;

    }

    public String getBuchNummer() {
        return buchNummer;
    }

    public String getBuchName() {
        return buchName;
    }
}
