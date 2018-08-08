package com.bcorpse.unittesing.unittesting.business;

import com.bcorpse.unittesing.unittesting.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemBuzzService {
    public Item retrieveHardcodeItem() {
        return new Item(1,"Ball", 10,10);
    }
}
