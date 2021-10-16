package com.test.comparator;

import com.test.base.list.BaseList;
import com.test.entity.Employee;

import java.util.Comparator;
import java.util.List;

/**
 * Sorting example with different comparator
 */
public class SortingUsingStream extends BaseList {

    /*******************************************************************java8 plus**********************************/

    public void sortByAge2(List<Employee> employees) {
        //sort by age using labmda comparator
        employees.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge());
    }

    public void sortByName2(List<Employee> employees) {
        //sort by name using labmda comparator
        employees.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()));
    }

    public void sortBySal2(List<Employee> employees) {
        //sort by salary using labmda comparator
        Comparator<Employee> salaryComparator = (e1, e2) -> e1.getSalary().compareTo(e2.getSalary());
        employees.stream().sorted(salaryComparator);
    }

    public void sortBySalReversed2(List<Employee> employees) {
        //sort by salary using labmda comparator
        Comparator<Employee> salaryComparator = (e1, e2) -> e1.getSalary().compareTo(e2.getSalary());
        employees.stream().sorted(salaryComparator.reversed());
    }
}
