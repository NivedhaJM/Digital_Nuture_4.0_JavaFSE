package com.cognizant.orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.orm_learn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
    // No need to write any code, JpaRepository gives you all CRUD methods
}
