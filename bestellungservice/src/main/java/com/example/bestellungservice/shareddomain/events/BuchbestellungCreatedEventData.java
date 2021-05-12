package com.example.bestellungservice.shareddomain.events;


import lombok.Data;

@Data
public class BuchbestellungCreatedEventData {

   private String bestellnummer;
   private String buchNummer;
   private String bezahltJa;
   private String verfügbarJa;
   private String buchstart;
   private String buchziel;

  public BuchbestellungCreatedEventData(String bestellnummer, String buchNummer, String bezahltJa, String verfügbarJa, String buchstart, String buchziel){


    this.bestellnummer = bestellnummer;
    this.buchNummer = buchNummer;
    this.bezahltJa = bezahltJa;
    this.verfügbarJa = verfügbarJa;
    this.buchstart = buchstart;
    this.buchziel = buchziel;



  }




}
