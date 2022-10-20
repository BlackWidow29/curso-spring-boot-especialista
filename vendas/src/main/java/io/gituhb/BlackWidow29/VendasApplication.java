package io.gituhb.BlackWidow29;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//essa anotacao diz para o spring container que ele deve gerenciar as classes deste pacote
//@ComponentScan(basePackages = {"io.gituhb.BlackWidow29.domain.repository", "io.gituhb.BlackWidow29.service"})
public class VendasApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
