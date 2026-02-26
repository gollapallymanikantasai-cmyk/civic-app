package com.civic.civicapp.service;

import com.civic.civicapp.model.Citizen;

public interface CitizenService {

    Citizen createCitizen(Citizen citizen);

    Citizen getCitizenById(Long id);
}	