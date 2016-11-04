/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.services;

import addressbook.entities.Country;
import addressbook.repositories.CountryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mikhail.davydov on 04.11.2016.
 */
@Service
@Slf4j
@Transactional(readOnly = true)
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public Country getOne(Long id) {
        return countryRepository.getOne(id);
    }
}
