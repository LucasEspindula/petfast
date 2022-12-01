package br.com.lucasespindula.petfast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class PetfastApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetfastApplication.class, args);
    }
}