package com.civic.civicapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.civic.civicapp.model.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
}