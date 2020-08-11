package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursopythoController{
    

    @GetMapping("/cursopython")
        public String cursopython(){
            return "cursopython";
            
        }
    

    }