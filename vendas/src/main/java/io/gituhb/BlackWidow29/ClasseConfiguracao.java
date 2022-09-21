package io.gituhb.BlackWidow29;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClasseConfiguracao {

    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }
}
