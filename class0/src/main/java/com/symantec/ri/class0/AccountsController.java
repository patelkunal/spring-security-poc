package com.symantec.ri.class0;

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

    @RequestMapping(value = "/rest/accounts", method = RequestMethod.GET)
    public ResponseEntity<HashMap<String, String>> accounts() {
        HashMap<String, String> resp = new HashMap<>(2);
        resp.put("name", "kunal");
        resp.put("designation", "SE");
        return ResponseEntity.ok(resp);
    }

}
