package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) throws CountryNotFoundException {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        CountryService countryService = context.getBean(CountryService.class);

        // Call test
        testAddCountry(countryService);
    }

    private static void testAddCountry(CountryService countryService) throws CountryNotFoundException {
        LOGGER.info("Start - Add Country");

        // Step 1: Create a new country instance
        Country newCountry = new Country();
        newCountry.setCode("JP");
        newCountry.setName("Japan");

        // Step 2: Add country to DB
        countryService.addCountry(newCountry);

        // Step 3: Fetch it back to verify
        Country country = countryService.findCountryByCode("JP");
        LOGGER.debug("Added Country: {}", country);

        LOGGER.info("End - Add Country");
    }
}
