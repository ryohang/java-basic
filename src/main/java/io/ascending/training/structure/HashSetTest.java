package io.ascending.training.structure;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args){
        Set<String> names = new HashSet();
        names.add("tianjie");
        names.add("tianjie");
        System.out.println(names.size());
    }
}
