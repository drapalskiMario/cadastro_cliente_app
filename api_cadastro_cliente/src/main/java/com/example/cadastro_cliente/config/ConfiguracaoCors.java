package com.example.cadastro_cliente.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ConfiguracaoCors implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Aplicar CORS para todos os endpoints da API
            .allowedOrigins("http://localhost:3000") // Substitua pela URL do seu frontend
            .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
