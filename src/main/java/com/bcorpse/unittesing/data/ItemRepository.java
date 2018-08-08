package com.bcorpse.unittesing.data;

import com.bcorpse.unittesing.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
