package com.test.stream.map;

import com.test.base.list.BaseList;
import com.test.entity.Employee;
import com.test.entity.Person;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

    public void convertListToMap(List<Employee> employees){
        Map<String, BigDecimal> result = employees.stream().collect(
                Collectors.toMap(Employee::getName, Employee::getSalary));
        result.forEach((k,v) -> System.out.println("Key:"+k+ " Value:"+v));
    }

    public void convertListToMap1(List<Employee> employees){
    //To avoid java.lang.IllegalStateException: Duplicate key
        Map<String, BigDecimal> result = employees.stream().collect(
                Collectors.toMap(Employee::getName, Employee::getSalary, (o,v)-> o));
        result.forEach((k,v) -> System.out.println("Key:"+k+ " Value:"+v));
    }


    public void convertListToMapSorted(List<Employee> employees){
        Map<String, BigDecimal> result = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(
                Collectors.toMap(Employee::getName, Employee::getSalary, (o,v)-> o, LinkedHashMap::new));
        result.forEach((k,v) -> System.out.println("Key:"+k+ " Value:"+v));
    }

}