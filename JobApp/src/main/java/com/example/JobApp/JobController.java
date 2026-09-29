package com.example.JobApp;

import org.springframework.web.bind.annotation.RequestMapping;

public class JobController {

    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }
}
