package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

import org.slf4j.Logger;

@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        testCountryOperations();
    }

    private static void testCountryOperations() {
        LOGGER.info("Start");

        // 1. Get all countries
        countryService.getAllCountries().forEach(c -> LOGGER.debug("{}", c));

        // 2. Add new country
        Country c = new Country();
        c.setCode("ZZ");
        c.setName("Zootopia");
        countryService.addCountry(c);

        // 3. Update
        countryService.updateCountry("ZZ", "Zootopia Updated");

        // 4. Find by code
        Country fetched = countryService.findCountryByCode("ZZ");
        LOGGER.debug("Fetched: {}", fetched);

        // 5. Find by name partial
        countryService.findCountriesByName("land").forEach(e -> LOGGER.debug("Match: {}", e));

        // 6. Delete
        countryService.deleteCountry("ZZ");

        LOGGER.info("End");
    }
}
