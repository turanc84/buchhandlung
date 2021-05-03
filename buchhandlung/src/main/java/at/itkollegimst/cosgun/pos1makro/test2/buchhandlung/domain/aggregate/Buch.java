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

    private String BuchNummer;

    private String BuchName;

    public Buch(CreateBuchCommand createBuchCommand){

        this.id = id;
        this.BuchNummer = createBuchCommand.getBuchNummer();
        this.BuchName = createBuchCommand.getBuchName();

        addDomainEvent(new BuchCreatedEvent(
                new BuchCreatedEventData(
                        this.BuchNummer,
                        this.BuchName
                )
        ));
    }

    public Long getId() {
        return id;
    }

    public String getBuchNummer() {
        return BuchNummer;
    }

    public String getBuchName() {
        return BuchName;
    }


    private addDomainEvent(Object event){
        registerEvent(event);
    }
}
