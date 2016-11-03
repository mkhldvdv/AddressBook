/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.controllers;

import addressbook.entities.Country;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mikhail.davydov on 21.10.2016.
 */
@RestController
@Slf4j
public class AddressBookController {

    @RequestMapping("/country")
    public Country getCountry() {
        log.info("in addressbook.controllers.AddressBookController.getCountry");
        Country country = new Country();
        country.setId(1L);
        country.setName("Russia");
        return country;
    }
}
