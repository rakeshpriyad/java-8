package com.test.stream.filter;

import com.test.base.list.BaseList;
import com.test.entity.Employee;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filter extends BaseList {
    public  String findEmpNameByAge(List<Employee> employeeList, int age) {
        return employeeList.stream().filter(e -> e.getAge() == age).map(Employee::getName).findAny().orElse("");
    }

    public List<Employee> filterNullValue(List<Employee> employees){
        return employees.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

}