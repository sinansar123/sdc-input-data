package com.definex.dfx.template.producer.rest.contract.impl;

import com.definex.dfx.template.producer.rest.contract.MainController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllerImpl implements MainController {

    @Override
    public ResponseEntity<String> hello(String name) {
        return new ResponseEntity<>("hello " + name, HttpStatus.OK);
    }
}
