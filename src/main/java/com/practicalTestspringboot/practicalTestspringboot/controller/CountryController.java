package com.practicalTestspringboot.practicalTestspringboot.controller;

import com.practicalTestspringboot.practicalTestspringboot.exception.CountryNotFoundException;
import com.practicalTestspringboot.practicalTestspringboot.model.Country;
import com.practicalTestspringboot.practicalTestspringboot.repository.CountryRepository;
import com.practicalTestspringboot.practicalTestspringboot.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rest/v2")
public class CountryController {

@Autowired
private CountryService countryService;



@PostMapping("/country")
public Country addCountry(@RequestBody Country country){
    return countryService.addCountry(country);
}

    @GetMapping("/country")
    public List<Country> fetchCountryList() {
        return countryService.fetchCountryList();
    }

    @GetMapping("/country/{id}")
    public Country fetchCountryById(@PathVariable("id") Long countryId)
            throws CountryNotFoundException {
        return countryService.fetchCountryById(countryId);
    }

    @DeleteMapping("/country/{id}")
    public String deleteCountryById(@PathVariable("id") Long countryId) throws CountryNotFoundException {
        countryService.deleteCountryById(countryId);
        return "Country deleted Successfully!!";
    }
@PutMapping("/country/{id}")
public Country updateCountry(@PathVariable("id") Long countryID,
                                   @RequestBody Country country) {
    return countryService.updateCountry(countryID,country);
}



}
