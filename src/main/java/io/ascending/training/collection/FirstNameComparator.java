package io.ascending.training.collection;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
//        char[] e1FirstNames = e1.getName().toCharArray();
//        char[] e2FirstNames = e2.getName().toCharArray();
//        //"zhang" , "zhang"
//        int size=e1FirstNames.length;
//        for(int i=0;i<size-1;i++){
//            if(e1FirstNames[i]-e2FirstNames[i]==0){
//                continue;
//            }else{
//                return e1FirstNames[i]-e2FirstNames[i];
//            }
//        }
//        return 0;
        //"st1 - str2" == str1.compareTo(str2);
//        return e1.getName().compareTo(e2.getName());
        if(e1.getName().compareTo(e2.getName())==0){
           return Long.valueOf(e1.getSalary() - e2.getSalary()).intValue();
        }else{
            return e1.getName().compareTo(e2.getName());
        }
    }
}
