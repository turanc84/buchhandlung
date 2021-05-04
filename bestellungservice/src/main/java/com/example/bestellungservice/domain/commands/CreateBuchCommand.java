package com.example.bestellungservice.domain.commands;


import lombok.Value;

@Value
public class CreateBuchCommand {


    String buchNummer;


    public CreateBuchCommand(String buchNummer){


        this.buchNummer = buchNummer;

    }


    public String getBuchNummer() {
        return buchNummer;
    }
}
