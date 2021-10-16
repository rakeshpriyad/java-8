package com.test.comparator;

import com.test.entity.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting example with different comparator
 */
public class ComparatorJ8 extends BaseSorting {
    /*******************************************************************java8 plus**********************************/

    public void sortByAge(List<Employee> employees) {
        //sort by age using labmda comparator
        employees.sort(Comparator.comparing(e -> e.getAge()));
    }

    public void sortByName(List<Employee> employees) {
        //sort by name using labmda comparator
        employees.sort(Comparator.comparing(Employee::getName));
    }

    public void sortBySal(List<Employee> employees) {
        //sort by salary using labmda comparator
        employees.sort(Comparator.comparing(Employee::getSalary));
    }

    public void sortBySalReversed(List<Employee> employees) {
        //sort by salary using labmda comparator
        Comparator<Employee> salaryComparator = (e1, e2)-> e1.getSalary().compareTo(e2.getSalary());
        employees.sort(salaryComparator.reversed());
    }

    public void sortOnMultipleFields(List<Employee> employees) {

        //Sorting on multiple fields; Group by.
        Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary);
        employees.sort(groupByComparator.reversed());
    }
}
