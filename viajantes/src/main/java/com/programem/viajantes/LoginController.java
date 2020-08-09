package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class LoginController {
   
    @PostMapping("/login")
    public String loginspost(){
        return "principal";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
