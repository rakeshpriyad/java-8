package com.test.stream.map;

import com.test.base.list.BaseList;
import com.test.entity.Employee;
import com.test.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class MapJ8 extends BaseList {

public List<String> convertTosStringList(List<Employee> employees){
    List<String> collect = employees.stream().map(x -> x.getName()).collect(Collectors.toList());
    return collect;
}

    public List<Person> convertToOtherList(List<Employee> employees){
        List<Person> collect = employees.stream().map(e -> new Person(e.getName(), e.getSalary(), e.getAge())).collect(Collectors.toList());
        return collect;
    }

}