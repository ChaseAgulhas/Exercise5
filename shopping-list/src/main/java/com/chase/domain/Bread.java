package com.chase.domain;

/**
 * Created by student on 2016/04/13.
 */
public class Bread extends Food {
    @Override
    public String handleFoodRequest(String request) {
        if (request.equalsIgnoreCase("bread")) {
            return "This is bread.";
        } else {
            if (nextFood != null) {
                return nextFood.handleFoodRequest(request);
            }
            return "No Food type";
        }
    }
}
