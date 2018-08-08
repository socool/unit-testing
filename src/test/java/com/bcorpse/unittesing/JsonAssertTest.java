package com.bcorpse.unittesing;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
    String actualResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":10}";

    @Test
    public void jsonAssertStrictTrueExceptForSpaces() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":10}";
        JSONAssert.assertEquals(expectedResponse,actualResponse,true);
    }

    @Test
    public void jsonAssertStrictFalse() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10}";
        JSONAssert.assertEquals(expectedResponse,actualResponse,false);
    }

    @Test
    public void jsonAssertWithoutEscapCharacters() throws JSONException {
        String expectedResponse = "{id:1,name:Ball,price:10}";
        JSONAssert.assertEquals(expectedResponse,actualResponse,false);
    }
}
