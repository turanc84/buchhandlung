package com.example.buchhanldungservice.shareddomain.events;


import lombok.Data;

@Data
public class BuchCreatedEventData {

    private String buchNummmer;
    private String buchName;

    public BuchCreatedEventData(String buchNummmer, String buchName){

        this.buchNummmer = buchNummmer;
        this.buchName = buchName;


    }



}
