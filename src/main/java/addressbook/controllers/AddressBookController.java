package addressbook.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mikhail.davydov on 21.10.2016.
 */
@RestController
@Slf4j
public class AddressBookController {

    @RequestMapping("/")
    public String hello() {
        return "hello AddressBook";
    }
}
