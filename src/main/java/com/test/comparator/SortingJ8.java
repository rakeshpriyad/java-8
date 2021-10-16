package com.test.comparator;

import com.test.entity.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting example with different comparator
 */
public class SortingJ8 extends BaseSorting {

    /*******************************************************************java8 plus**********************************/
    public void parallelSort(List<Employee> employees) {
        //sort by age using labmda comparator
        //Parallel Sorting
        Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);
        Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary);
        Arrays.parallelSort(employeesArray,groupByComparator);
    }

    public void sortByAge2(List<Employee> employees) {
        //sort by age using labmda comparator
        Collections.sort(employees, (e1, e2) -> e1.getAge() - e2.getAge());
    }

    public void sortByName2(List<Employee> employees) {
        //sort by name using labmda comparator
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
    }

    public void sortBySal2(List<Employee> employees) {
        //sort by salary using labmda comparator
        Comparator<Employee> salaryComparator = (e1, e2)-> e1.getSalary().compareTo(e2.getSalary());
       // Collections.sort(employees, (e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
        employees.sort(salaryComparator);
    }

    public void sortBySalReversed2(List<Employee> employees) {
        //sort by salary using labmda comparator
        Comparator<Employee> salaryComparator = (e1, e2)-> e1.getSalary().compareTo(e2.getSalary());
        employees.sort(salaryComparator.reversed());
    }
}
