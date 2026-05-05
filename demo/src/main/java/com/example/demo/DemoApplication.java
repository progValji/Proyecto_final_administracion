package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import jakarta.annotation.PostConstruct;

// import com.example.demo.service.ItemService;

@SpringBootApplication
public class DemoApplication {

    // @Autowired
    // private ItemService service;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
/* 
    @PostConstruct
    public void exportCsv() {
        service.generateCsv();
    } */
}