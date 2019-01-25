package com.cursan.garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    private int door;
    private int literPer100km;
    private String motor;
    private List<String> options = new ArrayList<String>();

    public Car (String modelName,String description,String manufacturer,String color,int speed,int year,int weight,int[] dimensions,int door,int literPer100km,String motor,List<String> options){
        super(modelName,description,manufacturer,color,speed,year,weight,dimensions);
        this.door = door;
        this.literPer100km = literPer100km;
        this.motor = motor;
        this.options = options;
    }

    public void startHeadLight(){
        System.out.println("J'allume mes phares");
    }

    public void opentTrunk(){
        System.out.println("J'ouvre mon coffre");
    }

    public int getDoor() {
        return door;
    }

    public int getLiterPer100km() {
        return literPer100km;
    }

    public String getMotor() {
        return motor;
    }

    public List<String> getOptions() {
        return options;
    }
}
