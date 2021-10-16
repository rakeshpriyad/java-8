package com.test.comparator;

import com.test.base.list.BaseList;
import com.test.entity.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting example with different comparator
 */
public class Sorting extends BaseList {
    public void sortByAge1(List<Employee> employees) {
        //sort by age
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getAge() - e2.getAge();
            }
        });
    }

    public void sortByName1(List<Employee> employees) {
        //sort by name
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
    }

    public void sortBySal1(List<Employee> employees) {
        //sort by salary
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getSalary().compareTo(e2.getSalary());
            }
        });
    }


    /*******************************************************************java8 plus**********************************/

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
        Collections.sort(employees, (e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
    }

}
