package com.practicalTestspringboot.practicalTestspringboot.service;

import com.practicalTestspringboot.practicalTestspringboot.exception.CountryNotFoundException;
import com.practicalTestspringboot.practicalTestspringboot.model.Country;

import java.util.List;

public interface CountryService {


    Country addCountry(Country country);

    List<Country> fetchCountryList();

    Country fetchCountryById(Long countryId) throws CountryNotFoundException;

    void deleteCountryById(Long countryId) throws CountryNotFoundException;

    Country updateCountry(Long countryID, Country country);
}
