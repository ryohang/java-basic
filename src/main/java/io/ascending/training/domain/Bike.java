package io.ascending.training.domain;

import io.ascending.training.WheelShape;

public class Bike implements Vehicle {
    private WheelShape wheelShape = WheelShape.ROUND;
    private Integer wheelNum = 2;

    @Override
    public void move() {
        new UnsupportedOperationException("Not Implemented yet!");
    }

    @Override
    public Integer getWheelNum() {
        return wheelNum;
    }

    @Override
    public WheelShape getWheelShape() {
        return wheelShape;
    }

    @Override
    public void getSeatType() {
        new UnsupportedOperationException("Not Implemented yet!");
    }

    public String toString() {
        return "WheelShape: " + getWheelShape() + ", Wheel Number: " + getWheelNum();
    }
}
