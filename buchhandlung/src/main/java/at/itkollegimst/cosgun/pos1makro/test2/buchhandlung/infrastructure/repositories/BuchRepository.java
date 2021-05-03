package at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.infrastructure.repositories;

import at.itkollegimst.cosgun.pos1makro.test2.buchhandlung.domain.aggregate.Buch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuchRepository  extends JpaRepository <Buch, Long> {

    Optional<Buch> getBuchByBuchNummer(String buchnummer);
}
