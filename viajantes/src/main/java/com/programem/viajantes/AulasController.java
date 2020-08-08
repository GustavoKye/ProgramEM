package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AulasController {
    
    @GetMapping("aulas")
    public String aulas(){
        return "aulas";
    }
}