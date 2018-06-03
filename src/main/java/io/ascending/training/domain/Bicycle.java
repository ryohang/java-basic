package io.ascending.training.domain;

public class Bicycle extends Bike{
    private Integer paddleNum = 2;


    public String toString() {
        return "WheelShape: " + getWheelShape() + ", Wheel Number: " + getWheelNum() + ", Paddle Number: " + paddleNum;
    }
}
