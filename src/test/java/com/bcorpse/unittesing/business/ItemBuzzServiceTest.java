package com.bcorpse.unittesing.business;

import com.bcorpse.unittesing.data.ItemRepository;
import com.bcorpse.unittesing.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ItemBuzzServiceTest {

        @InjectMocks
        ItemBuzzService business;

        @Mock
        ItemRepository repository;

        @Test
        public void retreiveAllItems() {

            //dataServiceMock retreiveAllData
            when(repository.findAll()).thenReturn(Arrays.asList(new Item(1,"Ball",10,10),
                    new Item(2,"Glove",5,25),
                    new Item(3,"Net",3,8)));
            List<Item> items = business.retreiveAllItems();

            assertEquals(100,items.get(0).getValue());
            assertEquals(24,items.get(2).getValue());
        }


    }
