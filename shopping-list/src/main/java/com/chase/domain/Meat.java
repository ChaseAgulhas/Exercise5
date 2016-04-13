package com.chase.domain;

/**
 * Created by student on 2016/04/09.
 */
public class Meat extends Food {
    @Override
    public String handleFoodRequest(String request) {
        if (request.equalsIgnoreCase("meat")) {
            return "This is meat.";
        } else {
            if (nextFood != null) {
                return nextFood.handleFoodRequest(request);
            }
            return "No Food type";
        }
    }
}
