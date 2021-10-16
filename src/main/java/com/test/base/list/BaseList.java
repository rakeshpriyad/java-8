package com.test.base.list;

import com.test.entity.Employee;
import com.test.entity.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BaseList {
    public  List<Employee> getEmployees() {

        List<Employee> result = new ArrayList<Employee>();
        result.add(new Employee("rakesh", new BigDecimal("170000"), 33));
        result.add(new Employee("rajesh", new BigDecimal("80000"), 20));
        result.add(new Employee("mukesh", new BigDecimal("1100000"), 10));
        result.add(new Employee("alok", new BigDecimal("170000"), 55));
        return result;
    }

    public  List<Employee> getEmployeesWithNull() {

        List<Employee> result = new ArrayList<Employee>();
        result.add(null);
        result.add(new Employee("rakesh", new BigDecimal("170000"), 33));
        result.add(new Employee("rajesh", new BigDecimal("80000"), 20));
        result.add(null);
        result.add(new Employee("mukesh", new BigDecimal("1100000"), 10));
        result.add(new Employee("alok", new BigDecimal("170000"), 55));
        result.add(null);
        return result;
    }

    public void display(List<Employee> employees){
        employees.forEach(System.out::println);
    }

    public void displayNames(List<String> employeeNames){
        employeeNames.forEach(System.out::println);
    }

    public void displayPerson(List<Person> personList){
        personList.forEach(System.out::println);
    }

    public void display1(List<Employee> employees){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
