package com.example.demo.controller;

import com.example.demo.data.Auto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/v1/auto")
public class AutoController {

    @PostMapping
    public String/*ResponseEntity<Auto>*/ getAuto(@Valid @RequestBody Auto auto){

        Auto a = auto;
        a.getAccessori().stream().forEach(System.out::println);
        return "tutto ok";
    }
}
