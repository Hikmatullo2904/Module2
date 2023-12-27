package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @PostMapping("/post")
    public String postHome() {
        return "this is post mapping";
    }
}
