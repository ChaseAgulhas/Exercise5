package com.chase.factories;

import com.chase.domain.Bread;
import com.chase.domain.Food;
import com.chase.domain.Meat;
import com.chase.domain.Vegetables;

/**
 * Created by student on 2016/04/09.
 */
public class FoodFactory {

    private static Bread bread;
    private static Meat meat;
    private static Vegetables vegetables;
    private static Food foodChain;

    public static String getFoodType(String type)
    {
        foodChain = setUpNextFoodChain();
        return foodChain.handleFoodRequest(type);
    }

    public static Food setUpNextFoodChain()
    {
        bread = new Bread();
        meat = new Meat();
        vegetables = new Vegetables();

        bread.setNextFood(meat);
        meat.setNextFood(vegetables);
        return bread;
    }

}
