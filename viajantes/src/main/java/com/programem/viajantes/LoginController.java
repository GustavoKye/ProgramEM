package com.programem.viajantes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

    
    @PostMapping("/login")
    public String loginspost(){
        return "login";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
}