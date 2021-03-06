package org.coderearth.securedpoc.class2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kunal_patel on 8/3/16.
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.coderearth.securedpoc.class2")
public class SelfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfApplication.class, args);
    }

}
