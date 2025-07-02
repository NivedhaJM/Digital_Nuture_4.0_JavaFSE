package com.cognizant.orm_learn.service;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository1;

	@Transactional
	    public Country findCountryByCode1(String countryCode) throws CountryNotFoundException {
	        Optional<Country> result = countryRepository.findById(countryCode);

	        if (!result.isPresent()) {
	            throw new CountryNotFoundException("Country not found with code: " + countryCode);
	        }

	        return result.get();
	}

	@Autowired
	private CountryRepository countryRepository;

	@Transactional
	public List<Country> getAllCountries() {
		return countryRepository1.findAll();
	}

	@Transactional
	public Country findCountryByCode(String code) {
		return countryRepository1.findById(code).orElse(null);
	}

	@Transactional
	public void addCountry(Country country) {
		countryRepository1.save(country);
	}

	@Transactional
	public void updateCountry(String code, String newName) {
		Country country = countryRepository1.findById(code).orElse(null);
		if (country != null) {
			country.setName(newName);
			countryRepository1.save(country);
		}
	}

	@Transactional
	public void deleteCountry(String code) {
		countryRepository1.deleteById(code);
	}

	@Transactional
	public List<Country> findCountriesByName(String name) {
		return countryRepository1.findByNameContainingIgnoreCase(name);
	}

}
