package com.test.comparator;

import com.test.entity.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SortingAndComparatorTest {

    @Test
    public void simpleSortByAgeComparatorTest() {
        Sorting sorting =  new Sorting();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortByAge1(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }

    @Test
    public void simpleSortByNameComparatorTest() {
        Sorting sorting =  new Sorting();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortByName1(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }

    @Test
    public void simpleSortBySalComparatorTest() {
        Sorting sorting =  new Sorting();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortBySal1(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }

}
