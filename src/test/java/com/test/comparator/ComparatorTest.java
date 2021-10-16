package com.test.comparator;

import com.test.entity.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    @Test
    public void lambdaSortOnMulitpleFieldsComparatorTest() {
        ComparatorJ8 sorting =  new ComparatorJ8();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortOnMultipleFields(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }
    @Test
    public void lambdaSortByAge2ComparatorTest() {
        ComparatorJ8 sorting =  new ComparatorJ8();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortByAge(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }

    @Test
    public void lambdaSortByName2ComparatorTest() {
        ComparatorJ8 sorting =  new ComparatorJ8();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortByName(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }

    @Test
    public void lambdaSortBySal2ComparatorTest() {
        ComparatorJ8 sorting =  new ComparatorJ8();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortBySal(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }

    @Test
    public void lambdaSortBySalReversed2ComparatorTest() {
        ComparatorJ8 sorting =  new ComparatorJ8();
        List<Employee> employees = sorting.getEmployees();
        System.out.println("Before Sort");
        sorting.display(employees);
        sorting.sortBySalReversed(employees);
        System.out.println("After Sort");
        sorting.display(employees);
        Assert.assertEquals(4, employees.size());
    }
}
