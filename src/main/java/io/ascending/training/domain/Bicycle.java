package io.ascending.training.domain;

import io.ascending.training.WheelShape;

public class Bicycle extends Bike{
    private Integer paddleNum = 2;
    public static String brand ="Giant";


    public String toString() {
        return "WheelShape: " + getWheelShape() + ", Wheel Number: " + getWheelNum() + ", Paddle Number: " + paddleNum;
    }
}
