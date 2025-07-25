package com.cognizant.spring_learn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
    Logger LOGGER = LoggerFactory.getLogger(getClass());    

    @Autowired
    private CountryService countryService;

    @GetMapping("/getAll")
    public List<Country> getCountries() {
        LOGGER.debug("Called getAll get mapping");
        return countryService.getCountries();
    }
}
