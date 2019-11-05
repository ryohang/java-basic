package io.ascending.training.domain;

import io.ascending.training.WheelShape;

public class Bike implements Vehicle,Ship {
    private WheelShape wheelShape = WheelShape.ROUND;
    protected Integer wheelNum = 2;

    @Override
    public void move() {
        System.out.print("1 mile per hour");
    }

    @Override
    public Integer getWheelNum() {
        return wheelNum;
    }

    @Override
    public WheelShape getWheelShape() {
        return wheelShape;
    }

    public void setWheelShape(WheelShape wheelShape) {
        this.wheelShape=wheelShape;
    }


    @Override
    public void getSeatType() {
        new UnsupportedOperationException("Not Implemented yet!");
    }

    public String toString() {
        return "WheelShape: " + getWheelShape() + ", Wheel Number: " + getWheelNum();
    }

    @Override
    public void floatRiver() {

    }

    public static String getWheelShapeStatic(){
        return "round";
    }

    public static void main(String[] args){
        Bike b = new Bike();
        System.out.println(b.getWheelShape());
        System.out.println(Bike.getWheelShapeStatic());

    }
}
