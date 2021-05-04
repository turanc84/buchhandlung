package com.example.bestellungservice.domain.commands;

import lombok.Value;

@Value
public class CreateBuchbestellungCommand {

    String bestellnummer;
    String buchNummer;
    String bezahltJa;
    String verfügbarJa;
    String buchstart;
    String buchziel;


    public CreateBuchbestellungCommand(String bestellnummer, String buchNummer, String bezahltJa, String verfügbarJa, String buchstart, String buchziel){

        this.bestellnummer = bestellnummer;
        this.buchNummer = buchNummer;
        this.bezahltJa = bezahltJa;
        this.verfügbarJa = verfügbarJa;
        this.buchstart = buchstart;
        this.buchziel = buchziel;


    }

    public String getBestellnummer() {
        return bestellnummer;
    }

    public String getBuchNummer() {
        return buchNummer;
    }

    public String getBezahltJa() {
        return bezahltJa;
    }

    public String getVerfügbarJa() {
        return verfügbarJa;
    }

    public String getBuchstart() {
        return buchstart;
    }

    public String getBuchziel() {
        return buchziel;
    }
}
