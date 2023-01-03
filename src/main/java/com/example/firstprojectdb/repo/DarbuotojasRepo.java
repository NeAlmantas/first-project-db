package com.example.firstprojectdb.repo;

import com.example.firstprojectdb.model.Darbuotojas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DarbuotojasRepo extends JpaRepository<Darbuotojas, String> {
}
