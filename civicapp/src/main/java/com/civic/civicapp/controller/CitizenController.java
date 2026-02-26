package com.civic.civicapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.civic.civicapp.model.Citizen;
import com.civic.civicapp.service.CitizenService;

@RestController
@RequestMapping("/citizens")
public class CitizenController {

    private final CitizenService citizenService;

    public CitizenController(CitizenService citizenService) {
        this.citizenService = citizenService;
    }

    @PostMapping
    public Citizen createCitizen(@RequestBody Citizen citizen) {
        return citizenService.createCitizen(citizen);
    }

    @GetMapping("/{id}")
    public Citizen getCitizen(@PathVariable Long id) {
        return citizenService.getCitizenById(id);
    }
}