package io.ascending.training.lambda;

import io.ascending.training.WheelShape;
import io.ascending.training.domain.Bike;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaTest {
//    @FunctionalInterface
    interface MyString {
        String myStringFunction(String str);
    }

    static class MyStringImpl implements MyString{
        public MyStringImpl(){};

        @Override
        public String myStringFunction(String str) {
            return "Good Morning " + str + "!";
        }
    }

    public static void main(String[] args){
        MyString classString = new LambdaTest.MyStringImpl();
        System.out.println(classString.myStringFunction("Ryo"));

        MyString classString2 = new MyString() {
            @Override
            public String myStringFunction(String str) {
                return "Good Morning " + str + "!";
            }
        };
        System.out.println(classString2.myStringFunction("Ryo"));



        MyString value = (str) -> "Good Morning " + str + "!";
        MyString value2 = (str) -> "Good Afternoon " + str + "!";;

        System.out.println(value.myStringFunction("Luis"));
        System.out.println(value2.myStringFunction("Ryo"));

        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        for(String item: items){
            System.out.println(item);
        }
        items.forEach((String x)->{
            System.out.println(x);
        });


        List<Bike> bikes = new ArrayList<>();
        Bike b1 = new Bike();
        b1.setWheelShape(WheelShape.SQUARE);
        Bike b2 = new Bike();
        b2.setWheelShape(WheelShape.ROUND);
        bikes.add(b1);
        bikes.add(b2);
        List<WheelShape> list = bikes.stream().map(Bike::getWheelShape).collect(Collectors.toList());
        System.out.println(list);

        String joined = bikes.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(joined);

        Map<WheelShape, List<Bike>> byWheelShape
                = bikes.stream()
                .collect(Collectors.groupingBy(Bike::getWheelShape));
        System.out.println(byWheelShape);
    }
}
