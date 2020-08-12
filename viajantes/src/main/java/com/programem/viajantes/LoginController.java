package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
   
    
    @GetMapping("/")
    public String principal(){
        return "principal";
    }
    @GetMapping("/login")
    public String login(){
        return "principal";
    }
}
