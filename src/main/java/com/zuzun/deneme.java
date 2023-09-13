package com.zuzun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class deneme {

    @RequestMapping("/deneme")
    public String deneme(){
        return "deneme";
    }
}
