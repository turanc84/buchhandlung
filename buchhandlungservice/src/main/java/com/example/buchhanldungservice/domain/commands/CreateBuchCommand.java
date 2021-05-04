package com.example.buchhanldungservice.domain.commands;

import lombok.Value;

@Value
public class CreateBuchCommand {


    private String BuchNummer;
    private String BuchName;



    public CreateBuchCommand(String Buchnummer, String Buchname)
    {
        this.BuchNummer = Buchnummer;
        this.BuchName = Buchname;
    }


    public String getBuchNummer() {
        return BuchNummer;
    }



    public String getBuchName() {
        return BuchName;
    }


}
