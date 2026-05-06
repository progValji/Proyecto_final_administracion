package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/articulos")
@RestController
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping
    public List<Item> getAll() {
        return service.getAll();
    }
  
}