package com.programem.viajantes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
    
@Controller
public class CursojavaController {
    

    @GetMapping("/cursojava")
        public String cursojava(){
            return "cursojava";
            
        }
    
}
