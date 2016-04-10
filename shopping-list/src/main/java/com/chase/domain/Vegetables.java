package com.chase.domain;

/**
 * Created by student on 2016/04/09.
 */
public class Vegetables extends Food {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("vegetable")) {
            return "This is a vegetable.";
        } else {
            if (nextFood != null) {
                return nextFood.handleRequest(request);
            }
            return "No Food type";
        }
    }
}
