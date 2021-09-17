package com.practicalTestspringboot.practicalTestspringboot.controller;

import com.practicalTestspringboot.practicalTestspringboot.model.Country;
import com.practicalTestspringboot.practicalTestspringboot.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

@Autowired
private CountryService countryService;

@PostMapping("/country")
public Country addCountry(@RequestBody Country country){
    return countryService.addCountry(country);

}
}
