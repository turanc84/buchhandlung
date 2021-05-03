package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.aggregate;


import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.commands.CreateBuchCommand;
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
