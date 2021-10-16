package com.test.comparator;

import com.test.entity.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SortingAndComparatorStreamTestJ8 {

    @Test
    public void lambdaSortByAge2ComparatorTest() {
        SortingUsingStream sorting =  new SortingUsingStream();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortByAge2(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }

    @Test
    public void lambdaSortByName2ComparatorTest() {
        SortingUsingStream sorting =  new SortingUsingStream();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortByName2(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }

    @Test
    public void lambdaSortBySal2ComparatorTest() {
        SortingUsingStream sorting =  new SortingUsingStream();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortByAge2(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }

    @Test
    public void lambdaSortBySalReversed2ComparatorTest() {
        SortingUsingStream sorting =  new SortingUsingStream();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortBySalReversed2(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }
}
