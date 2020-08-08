package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroController {
    

    @PostMapping("/cadastro")
        public String cadastro(){
            return "cadastro";
            
        }
    
}