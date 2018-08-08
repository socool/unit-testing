package com.bcorpse.unittesing.business;

import com.bcorpse.unittesing.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemBuzzService {
    public Item retrieveHardcodeItem() {
        return new Item(1,"Ball", 10,10);
    }
}
