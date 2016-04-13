package com.chase.domain;

/**
 * Created by student on 2016/04/09.
 */
public abstract class Food {
    Food nextFood;
    public void setNextFood(Food nextFood) {
        this.nextFood = nextFood;
    }
    public abstract String handleFoodRequest(String request);

}
