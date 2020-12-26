package com.globallabs.springwebmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class
JediController {
    @GetMapping("/jedi")
    public String jedi(){
        return "jedi";
    }

}
