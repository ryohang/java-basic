package io.ascending.training.reflection;

import java.lang.annotation.Annotation;

public class AnnotationTest {
    public static void main(String[] args){
        Class aClass = ClassReflection.class;
        Annotation annotation = aClass.getAnnotation(AnnotationExample.class);

        if(annotation instanceof AnnotationExample){
            AnnotationExample myAnnotation = (AnnotationExample) annotation;
            System.out.println("name: " + myAnnotation.name());
            System.out.println("value: " + myAnnotation.value());
        }
    }
}
