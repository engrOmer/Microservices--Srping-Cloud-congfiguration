package com.example.microservices.limitsserivces;

import com.example.microservices.limitsserivces.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limit retrieve() {
        return new Limit(configuration.getMinimum(), configuration.getMaximum()) ;
    }


}
