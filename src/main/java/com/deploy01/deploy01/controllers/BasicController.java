package com.deploy01.deploy01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    public java.lang.String myName(java.lang.String devName){
        devName = "Samuele";
        return devName;
    }
}
