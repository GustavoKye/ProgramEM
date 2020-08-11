package com.programem.viajantes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
    
@Controller
public class CursohtmlController {
    

    @GetMapping("/cursohtml")
        public String cursohtml(){
            return "cursohtml";
            
        }
    
}
