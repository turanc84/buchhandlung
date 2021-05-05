package com.example.bestellungservice.infrastructure.repositories;

import com.example.bestellungservice.domain.aggregate.Buchbestellung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuchbestellungRepository extends JpaRepository<Buchbestellung, Long> {


    Optional<Buchbestellung> getBuchbestellungByBestellnummer(String bestellungNo);

}
