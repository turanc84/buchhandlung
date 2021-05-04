package com.example.bestellungservice.domain.aggregate;


import com.example.bestellungservice.domain.commands.CreateBuchCommand;
import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Buch extends AbstractAggregateRoot<Buch> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String buchNummer;


    public Buch(){

    }

    public Buch(CreateBuchCommand createBuchCommand){


        this.buchNummer = createBuchCommand.getBuchNummer();

    }


    public Long getId() {
        return id;
    }

    public String getBuchNummer() {
        return buchNummer;
    }
}
