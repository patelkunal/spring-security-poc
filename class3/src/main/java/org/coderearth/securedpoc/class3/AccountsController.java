package org.coderearth.securedpoc.class3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * Created by kunal_patel on 8/4/16.
 */
@RestController
public class AccountsController {

    private final static Logger LOGGER = LoggerFactory.getLogger(AccountsController.class);

    @PostConstruct
    public void postInit() {
        LOGGER.info("Registering {}", this.getClass().getCanonicalName());
    }

    @RequestMapping(value = "/rest/accounts", method = RequestMethod.GET)
    public ResponseEntity<HashMap<String, String>> accounts() {
        HashMap<String, String> resp = new HashMap<>(2);
        resp.put("name", "kunal");
        resp.put("designation", "SE");
        return ResponseEntity.ok(resp);
    }

    @RequestMapping(value = "/preauth/accounts", method = RequestMethod.GET)
    public ResponseEntity<HashMap<String, String>> automationsAccounts() {
        HashMap<String, String> resp = new HashMap<>(2);
        resp.put("name", "kunal");
        resp.put("designation", "admin");
        return ResponseEntity.ok(resp);
    }

}
