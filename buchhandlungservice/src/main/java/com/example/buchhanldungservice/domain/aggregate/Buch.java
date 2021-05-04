package com.example.buchhanldungservice.domain.aggregate;


import com.example.buchhanldungservice.domain.commands.CreateBuchCommand;
import com.example.buchhanldungservice.shareddomain.events.BuchCreatedEvent;
import com.example.buchhanldungservice.shareddomain.events.BuchCreatedEventData;
import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
@Data
public class Buch extends AbstractAggregateRoot
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)

    private String buchNummer;

    private String buchName;

    public Buch(){

    }

    public Buch(CreateBuchCommand createBuchCommand){

        this.id = id;
        this.buchNummer = createBuchCommand.getBuchNummer();
        this.buchName = createBuchCommand.getBuchName();

        addDomainEvent(new BuchCreatedEvent(
                new BuchCreatedEventData(
                        this.buchNummer,
                        this.buchName
                )
        ));



    }

    public Long getId() {
        return id;
    }

    public String getBuchNummer() {
        return buchNummer;
    }

    public String getBuchName() {
        return buchName;
    }


    private void addDomainEvent(Object event){
        registerEvent(event);
    }
}
