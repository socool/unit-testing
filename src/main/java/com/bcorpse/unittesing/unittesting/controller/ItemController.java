package com.bcorpse.unittesing.unittesting.controller;

import com.bcorpse.unittesing.unittesting.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @GetMapping("/dummy-item")
    public Item helloWorld(){
        return new Item(1, "Ball", 10, 10);
    }
}
