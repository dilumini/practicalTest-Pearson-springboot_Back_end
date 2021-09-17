package com.practicalTestspringboot.practicalTestspringboot.repository;

import com.practicalTestspringboot.practicalTestspringboot.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {


}
