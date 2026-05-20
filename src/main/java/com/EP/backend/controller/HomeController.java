package com.EP.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String welcome() {
        logger.info("Received request for /");
        return "Welcome to the backend API";
    }

    @GetMapping("/api/home")
    public String apiWelcome() {
        logger.info("Received request for /api/home");
        return "Welcome from the backend API";
    }
}
