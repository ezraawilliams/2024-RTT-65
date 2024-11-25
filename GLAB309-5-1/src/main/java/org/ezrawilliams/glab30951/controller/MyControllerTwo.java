package org.ezrawilliams.glab30951.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllerTwo {
    @GetMapping({ "login"})   // either type '/' or index
    public String showIndex()
    {
        return "index";
    }

}
