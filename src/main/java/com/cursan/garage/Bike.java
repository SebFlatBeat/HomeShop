package com.cursan.garage;

public class Bike extends Vehicle {
    public Bike(String modelName, String description, String manufacturer, String color, int speed, int year, int weight, int[] dimensions) {
        super(modelName, description, manufacturer, color, speed, year, weight, dimensions);
    }

    public Bike() {
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
