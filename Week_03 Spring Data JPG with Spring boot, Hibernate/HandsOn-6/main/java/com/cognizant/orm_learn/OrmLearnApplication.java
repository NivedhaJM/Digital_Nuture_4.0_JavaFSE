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
        // Bootstraps Spring and returns ApplicationContext
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        // Get the CountryService bean from the context
        CountryService countryService = context.getBean(CountryService.class);

        // Call test method
        testFindCountryByCode(countryService);
    }

    private static void testFindCountryByCode(CountryService countryService) throws CountryNotFoundException {
        LOGGER.info("Start");

        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country: {}", country);

        LOGGER.info("End");
    }
}
