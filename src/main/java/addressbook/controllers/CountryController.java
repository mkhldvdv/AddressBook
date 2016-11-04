/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.controllers;

import addressbook.entities.Country;
import addressbook.repositories.CountryRepository;
import addressbook.services.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mikhail.davydov on 04.11.2016.
 */
@RestController
@Slf4j
public class CountryController {

    @Autowired
    CountryService countryService;

    @RequestMapping("/country/{id}")
    public Country getCountry(@PathVariable Long id) {
        log.info("in addressbook.controllers.CountryController");
        return countryService.getOne(id);
    }
}
