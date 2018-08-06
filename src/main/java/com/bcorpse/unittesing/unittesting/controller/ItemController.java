package com.bcorpse.unittesing.unittesting.controller;

import com.bcorpse.unittesing.unittesting.business.ItemBuzzService;
import com.bcorpse.unittesing.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemBuzzService buzzService;

    @GetMapping("/dummy-item")
    public Item helloWorld(){
        return new Item(1, "Ball", 10, 10);
    }

    @GetMapping("/item-from-buzz")
    public Item itemFromBuzz(){
        return buzzService.retrieveHardcodeItem();
    }
}
