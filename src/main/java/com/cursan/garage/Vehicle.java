package com.cursan.garage;

public abstract class Vehicle {
    protected String modelName;
    private String description;
    private String manufacturer;
    private String color;
    private int speed;
    private int year;
    private int weight;
    private int[] dimensions = new int[3];

    public Vehicle() {
    }

    public Vehicle (String modelName, String description, String manufacturer, String color, int speed, int year, int weight, int[] dimensions) {
        this.modelName = modelName;
        this.description = description;
        this.manufacturer = manufacturer;
        this.color = color;
        this.speed = speed;
        this.year = year;
        this.weight = weight;
        this.dimensions = dimensions;
    }

        public abstract void start();

        public abstract void stop();

    public String getModelName() {
        return modelName;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public int getWeight() {
        return weight;
    }

    public int[] getDimensions() {
        return dimensions;
    }
}


