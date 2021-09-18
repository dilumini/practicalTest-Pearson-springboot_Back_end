package com.practicalTestspringboot.practicalTestspringboot.service;

import com.practicalTestspringboot.practicalTestspringboot.exception.CountryNotFoundException;
import com.practicalTestspringboot.practicalTestspringboot.model.Country;
import com.practicalTestspringboot.practicalTestspringboot.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country updateCountryById(Long countryId, Country country) {
        return null;
    }

    @Override
    public Country addCountry(Country country) {

        return countryRepository.save(country);
    }

    @Override
    public List<Country> fetchCountryList() {
        return countryRepository.findAll();
    }

    @Override
    public Country fetchCountryById(Long countryId) throws CountryNotFoundException {
        Optional<Country> country =
                countryRepository.findById(countryId);

        if(!country.isPresent()) {
            throw new CountryNotFoundException("Country Not available");
        }

        return  country.get();
    }

    @Override
    public void deleteCountryById(Long countryId)  {
        countryRepository.deleteById(countryId);
    }


}
