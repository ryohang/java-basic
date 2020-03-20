package io.ascending.training.collection;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Long.valueOf(e1.getSalary() - e2.getSalary()).intValue();
    }
}
