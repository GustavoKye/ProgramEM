package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicialController {
    @GetMapping("/inicial")
    public String inicial(){
        return "inicial";
    }
}