package io.gituhb.BlackWidow29;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//essa anotacao diz para o spring container que ele deve gerenciar as classes deste pacote
//@ComponentScan(basePackages = {"io.gituhb.BlackWidow29.repository", "io.gituhb.BlackWidow29.service"})
public class VendasApplication {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
