package com.test.stream.filter;

import com.test.entity.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FilterTest {
    @Test
    public void filterTest() {
        Filter f = new Filter();
        String empName = f.findEmpNameByAge(f.getEmployees(), 33);
        System.out.println(empName);
        Assert.assertEquals("rakesh", empName);
    }

    @Test
    public void filterNullTest() {
        Filter f = new Filter();
        List<Employee> employeeList = f.filterNullValue(f.getEmployeesWithNull());
        f.display(f.getEmployeesWithNull());
        System.out.println("After filter");
        f.display(employeeList);
        Assert.assertNotNull( employeeList);
    }
}
