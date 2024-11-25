package org.ezrawilliams.glab30951.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class MyController {
    @RequestMapping({"/login"})   // either type '/' or index
    public String showLogin()
    {
        return "inboxpage";
    }
    @RequestMapping("/")
    public String simpleMethod() {
        //mapped to hostname:port/home/
        return "inboxpage";
    }

    @RequestMapping("/index")
    public String showIndex() {
        //mapped to hostname:port/home/index/
        return "inboxpage";
    }

}
