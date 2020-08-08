package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PrincipalController {
   
    @PostMapping("/principal")
    public String principal(){
    return "principal";
}
}