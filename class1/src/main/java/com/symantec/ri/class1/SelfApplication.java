package com.symantec.ri.class1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kunal_patel on 8/3/16.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.symantec.ri.class1")
public class SelfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfApplication.class, args);
    }

}
