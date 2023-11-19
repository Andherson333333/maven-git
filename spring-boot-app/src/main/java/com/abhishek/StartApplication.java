package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "I have successfully built a Spring Boot application using Maven");
        model.addAttribute("msg", "This application is deployed on to Kubernetes using Argo CD");
        return "index";
    }

    // Nuevo método para simular el inicio
    public boolean start() {
        // Lógica de inicio simulada, podrías agregar la lógica real aquí
        return true;
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
