package io.ascending.training.domain;

public class Motorcycle extends Bike {
    private Integer paddleNum = 1;
    private Boolean hasGasTank = Boolean.TRUE;
    private Boolean hasMotor = Boolean.TRUE;


    public String toString() {
        return "WheelShape: " + getWheelShape() + ", Wheel Number: " + getWheelNum() + ", Paddle Number: " + paddleNum + ", Gas Tank: " + hasGasTank + ", has Motor: " + hasMotor;
    }
}
