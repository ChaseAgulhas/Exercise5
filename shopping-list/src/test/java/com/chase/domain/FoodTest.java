package com.chase.domain;

import com.chase.factories.FoodFactory;
import org.junit.Test;

/**
 * Created by student on 2016/04/13.
 */
public class FoodTest {
    @Test
    public void testFoodFactory() throws Exception {

    String food = FoodFactory.getFoodType("vegetable");
        System.out.println(food);
    }
}
