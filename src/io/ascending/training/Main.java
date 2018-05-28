package io.ascending.training;

import io.ascending.training.domain.Bicycle;
import io.ascending.training.domain.Bike;
import io.ascending.training.domain.Motorcycle;

public class Main {

    public static void main(String[] args) {
        System.out.print("======== Main Intake Parameters address "+ args + "\n");
        System.out.print("======== Main Intake Parameters first element: "+ args[0] + "\n");
	    Bike b = new Bike();
        Bicycle by = new Bicycle();
        Motorcycle mc = new Motorcycle();

        System.out.print("======== Print Bike Info ========= \n");
	    System.out.print(b);
        System.out.print("\n");

        System.out.print("======== Print Bicycle Info ========= \n");
        System.out.print(by);
        System.out.print("\n");

        System.out.print("======== Print Motorcycle Info ========= \n");
        System.out.print(mc);
        System.out.print("\n");


    }
}
