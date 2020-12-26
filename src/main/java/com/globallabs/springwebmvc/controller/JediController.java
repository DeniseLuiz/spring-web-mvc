package com.globallabs.springwebmvc.controller;

import org.springframework.stereotype.Controller;

@Controller

class JediController {
    @GetMapping("jedi")
    public String jedi(){
        return "jedi";
    }

}
