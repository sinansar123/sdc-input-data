package com.definex.dfx.template.producer.rest.contract;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
@RequestMapping(value = "/api/v1")
public interface MainController {

    @GetMapping(value = "/hello/{name}")
    ResponseEntity<String> hello(@PathVariable String name);
}
