package Estefania.Alvarez.simpleApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
    
    @GetMapping("/hello")
    public String helloWorld(){
        return "Aplicación web muy simple";
    }
}
