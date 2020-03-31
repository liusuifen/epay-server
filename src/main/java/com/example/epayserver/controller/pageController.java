package com.example.epayserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {

    @RequestMapping("gotoIndex")
    public String gotoIndex(){
        return "index";
    }
}
