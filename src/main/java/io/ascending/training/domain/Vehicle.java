package io.ascending.training.domain;

import io.ascending.training.WheelShape;

public interface Vehicle {
    void move();
    Integer getWheelNum();
    WheelShape getWheelShape();
    void getSeatType();
}
