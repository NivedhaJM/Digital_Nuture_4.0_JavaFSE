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

        // Test update
        testUpdateCountry(countryService);
    }

    private static void testUpdateCountry(CountryService countryService) throws CountryNotFoundException {
        LOGGER.info("Start - Update Country");

        // Step 1: Update the country name
        countryService.updateCountry("JP", "Nippon");

        // Step 2: Fetch and log updated country
        Country updatedCountry = countryService.findCountryByCode("JP");
        LOGGER.debug("Updated Country: {}", updatedCountry);

        LOGGER.info("End - Update Country");
    }
}
