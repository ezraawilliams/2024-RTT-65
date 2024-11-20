package org.ezrawilliams.simplethymeleafexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //This class is a controller
public class HelloWorldController {

    @GetMapping({"/showview"})/*GET is the HTTP method
                                    /showview - this is the path on our websit
                                    */
    //Handler method that handles the GET request
    public String sendDataTwo(Model model) {/*
        The model object is the MODEL part of MVC meaning
        it will be the HOLDER of the data that is passed to and
        FROM our VIEW*/
        String message = "Perscholas ! We are Learning Thymeleaf";
        //  log.warn(u.toString());
        model.addAttribute("myvar", message);/*
        There should be a myvar variable in our Thymeleaf template
        */
        return "myview"; //the template that is returned after processing
    }
}
