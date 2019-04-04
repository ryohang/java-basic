package io.ascending.training.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.getSalary() - e2.getSalary());
    }
}
