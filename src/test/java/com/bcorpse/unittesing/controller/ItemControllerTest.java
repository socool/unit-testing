package com.bcorpse.unittesing.controller;

import com.bcorpse.unittesing.business.ItemBuzzService;
import com.bcorpse.unittesing.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemBuzzService itemBuzzService;

    @Test
    public void dummyItemBasic() throws Exception{
        // call "/hello-world"
        RequestBuilder request = MockMvcRequestBuilders
                .get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content()
                        .json("{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":10}"))
                .andReturn();

        // verify

    }

    @Test
    public void itemFromBuzzServiceBasic() throws Exception{
        when(itemBuzzService.retrieveHardcodeItem()).thenReturn(new Item(1,"Ball",10,10));
        // call "/hello-world"
        RequestBuilder request = MockMvcRequestBuilders
                .get("/item-from-buzz")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content()
                        .json("{id:1,name:Ball,price:10,quantity:10}"))
                .andReturn();

        // verify

    }
}
