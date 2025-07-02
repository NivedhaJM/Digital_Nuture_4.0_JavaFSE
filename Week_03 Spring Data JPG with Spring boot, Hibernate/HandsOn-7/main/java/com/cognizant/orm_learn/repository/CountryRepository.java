package com.cognizant.orm_learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.orm_learn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    // Find by name containing (partial match)
    List<Country> findByNameContainingIgnoreCase(String name);
}
