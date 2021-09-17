package com.practicalTestspringboot.practicalTestspringboot.service;

import com.practicalTestspringboot.practicalTestspringboot.model.Country;
import com.practicalTestspringboot.practicalTestspringboot.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }
}
