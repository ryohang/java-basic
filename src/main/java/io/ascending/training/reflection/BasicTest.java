package io.ascending.training.reflection;

import io.ascending.training.domain.Bike;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BasicTest {

    public static void main(String args[]) throws Exception {
         Bike obj = new Bike();
        // Creating class object from the object using
        // getclass method
        Class cls = obj.getClass();
        System.out.println("The name of class is " +
                cls.getName());

        // Getting the constructor of the class through the
        // object of the class
        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " +
                constructor.getName());

        System.out.println("The public methods of class are : ");

        // creates object of the desired field by providing
        // the name of field as argument to the
        // getDeclaredField method
        Field field = cls.getDeclaredField("wheelNum");
        System.out.println("this field name is:"+field.getName());

        // allows the object to access the field irrespective
        // of the access specifier used with the field
        field.setAccessible(true);

        // takes object and the new value to be assigned
        // to the field as arguments
        field.set(obj, 50);
        System.out.println(obj.getWheelNum());

        // Getting methods of the class through the object
        // of the class by using getMethods
        Method[] methods = cls.getDeclaredMethods();
//        Method[] methods = cls.getMethods();
        // Printing method names
        obj.getWheelShape();
//        if("getWheelShape"){
//            obj.getWheelShape()
//        }else if("number"=5){
//            obj.getWheelNum()
//        }else{
//            obj.getSeatType();
//        }
        for (Method method:methods)
//            method.invoke(obj, "parameter");
            System.out.println(method.getName());

        // creates object of desired method by providing the
        // method name and parameter class as arguments to
        // the getDeclaredMethod
//        Method methodcall1 = cls.getDeclaredMethod("method2",
//                int.class);
//
//        // invokes the method at runtime
//        methodcall1.invoke(obj, 19);
//        // Creates object of desired method by providing the
//        // method name as argument to the getDeclaredMethod
        Method methodcall2 = cls.getDeclaredMethod("move");

        // invokes the method at runtime
        methodcall2.invoke(obj);
//
//        // Creates object of the desired method by providing
//        // the name of method as argument to the
//        // getDeclaredMethod method
//        Method methodcall3 = cls.getDeclaredMethod("getWheelNum");
//
//        // allows the object to access the method irrespective
//        // of the access specifier used with the method
//        methodcall3.setAccessible(true);
//
//        // invokes the method at runtime
//        methodcall3.invoke(obj);


    }
}
