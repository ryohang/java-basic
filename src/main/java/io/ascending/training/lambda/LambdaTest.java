package io.ascending.training.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    interface MyString {
        String myStringFunction(String str);
    }

    class MyStringImpl implements MyString{

        @Override
        public String myStringFunction(String str) {
            return "Good Morning " + str + "!";
        }
    }


    public static void main(String[] args){
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
        items.forEach(abce->{
            System.out.println(abce);
        });

    }
}
