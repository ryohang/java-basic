package io.ascending.training.domain;

public class Bicycle2 extends GiantBicycle{

//    @Override
//    public void move(){
//        System.out.print("2 mile per hour\n");
//    }

    public void moveTwice(){
        move();
        move();
    }

    public static void main(String[] args){
        Bicycle2 bicycle2 = new Bicycle2();
        bicycle2.moveTwice();
        System.out.println(BikeType.MOTOCYCLE.ordinal());
    }
}
