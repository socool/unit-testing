package com.bcorpse.unittesing.business;

import com.bcorpse.unittesing.data.ItemRepository;
import com.bcorpse.unittesing.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemBuzzService {

    @Autowired
    private ItemRepository repository;

    public Item retrieveHardcodeItem() {
        return new Item(1,"Ball", 10,10);
    }

    public List<Item> retreiveAllItems(){
        List<Item> items = repository.findAll();
        for(Item item:items){
            item.setValue(item.getPrice()*item.getQuantity());
        }
        return items;
    }
}
