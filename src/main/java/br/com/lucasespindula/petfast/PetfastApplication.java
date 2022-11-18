package br.com.lucasespindula.petfast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PetfastApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetfastApplication.class, args);
    }
}