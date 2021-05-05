package com.example.bestellungservice.infrastructure.repositories;

import com.example.bestellungservice.domain.aggregate.Buch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuchRepository extends JpaRepository<Buch, Long> {

    Optional<Buch> getBuchByBuchNummer(String buchnummer);

}
