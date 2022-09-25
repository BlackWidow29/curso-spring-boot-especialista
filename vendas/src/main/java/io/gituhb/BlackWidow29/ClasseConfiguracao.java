package io.gituhb.BlackWidow29;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Desenvolvimento
public class ClasseConfiguracao {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }
}
