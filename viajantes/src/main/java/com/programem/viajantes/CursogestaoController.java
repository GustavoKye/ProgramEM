package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursogestaoController {
    

    @GetMapping("/cursogestao")
    public String cursogestao(){
        return "cursogestao";
    }
}