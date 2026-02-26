package com.civic.civicapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.civic.civicapp.model.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen, Long> {
}