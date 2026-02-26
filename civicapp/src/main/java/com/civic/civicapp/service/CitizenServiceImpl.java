package com.civic.civicapp.service;

import org.springframework.stereotype.Service;

import com.civic.civicapp.exception.ResourceNotFoundException;
import com.civic.civicapp.model.Citizen;
import com.civic.civicapp.repository.CitizenRepository;

@Service
public class CitizenServiceImpl implements CitizenService {

    private final CitizenRepository citizenRepository;

    public CitizenServiceImpl(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

    @Override
    public Citizen createCitizen(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    @Override
    public Citizen getCitizenById(Long id) {
        return citizenRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Citizen not found"));
    }
}