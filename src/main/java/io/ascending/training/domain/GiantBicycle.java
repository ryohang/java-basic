package io.ascending.training.domain;

import io.ascending.training.WheelShape;

public abstract class GiantBicycle {
    protected final String brand="Giant";
    void move() {
        System.out.print("1 mile per hour\n");
    };
    void getSeatType(){};
}
