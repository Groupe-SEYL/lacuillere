package com.seyl.lacuillere.lacuillere.beans;

import com.seyl.lacuillere.beans.RestaurantSend;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class RestaurantSendTest {

    private RestaurantSend restaurantSend = new RestaurantSend();

    @Test
    public void testDefaultConstructor() {
        assertNotNull(restaurantSend);
    }

}
