package com.example.bestellungservice.domain.aggregate;


import com.example.bestellungservice.domain.commands.CreateBuchbestellungCommand;
import com.example.bestellungservice.shareddomain.events.BuchbestellungCreatedEvent;
import com.example.bestellungservice.shareddomain.events.BuchbestellungCreatedEventData;
import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
@Data
public class Buchbestellung extends AbstractAggregateRoot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(unique = true)
    private String bestellnummer;

    private String buchNummer;

    private String bezahltJa;

    private String verfügbarJa;

    private String buchstart;

    private String buchziel;


    public Buchbestellung(){

    }



    public Buchbestellung(CreateBuchbestellungCommand createBuchbestellungCommand) {

        this.bestellnummer = createBuchbestellungCommand.getBestellnummer();
        this.buchNummer = createBuchbestellungCommand.getBuchNummer();
        this.bezahltJa = createBuchbestellungCommand.getBezahltJa();
        this.verfügbarJa = createBuchbestellungCommand.getVerfügbarJa();
        this.buchstart = createBuchbestellungCommand.getBuchstart();
        this.buchziel = createBuchbestellungCommand.getBuchziel();

        //Domainevent
        addDomainEvent(new BuchbestellungCreatedEvent(

                new BuchbestellungCreatedEventData(
                        this.bestellnummer,
                        this.buchNummer,
                        this.bezahltJa,
                        this.verfügbarJa,
                        this.buchstart,
                        this.buchziel



                )


        ));

    }

    private void addDomainEvent(Object event){
        registerEvent(event);
    }


    public Long getId() {
        return id;
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
