package com.test.base.list;

import com.test.entity.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseList {
    public List<Employee> getEmployees() {

        List<Employee> result = new ArrayList<Employee>();
        result.add(new Employee("rakesh", new BigDecimal("170000"), 33));
        result.add(new Employee("rajesh", new BigDecimal("80000"), 20));
        result.add(new Employee("mukesh", new BigDecimal("1100000"), 10));
        result.add(new Employee("alok", new BigDecimal("170000"), 55));
        return result;
    }

    public List<Employee> getEmployeesWithNull() {

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

    public void display(List<Employee> employees) {
        employees.forEach(System.out::println);
    }

    public void displayNames(List<String> employeeNames) {
        employeeNames.forEach(System.out::println);
    }

    public void displayPerson(List<Person> personList) {
        personList.forEach(System.out::println);
    }

    public void display1(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    public List<Order> findAllOrder() {

        LineItem item1 = new LineItem(1, "apple", 1, new BigDecimal("1.20"), new BigDecimal("1.20"));
        LineItem item2 = new LineItem(2, "orange", 2, new BigDecimal(".50"), new BigDecimal("1.00"));
        Order order1 = new Order(1, "A0000001", Arrays.asList(item1, item2), new BigDecimal("2.20"));

        LineItem item3 = new LineItem(3, "monitor BenQ", 5, new BigDecimal("99.00"), new BigDecimal("495.00"));
        LineItem item4 = new LineItem(4, "monitor LG", 10, new BigDecimal("120.00"), new BigDecimal("1200.00"));
        Order order2 = new Order(2, "A0000002", Arrays.asList(item3, item4), new BigDecimal("1695.00"));

        LineItem item5 = new LineItem(5, "One Plus 8T", 3, new BigDecimal("499.00"), new BigDecimal("1497.00"));
        Order order3 = new Order(3, "A0000003", Arrays.asList(item5), new BigDecimal("1497.00"));

        return Arrays.asList(order1, order2, order3);

    }

    public List<Item> getItem() {
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
        return items;
    }

    public List<String> getFruits() {
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
        return items;
    }

    public List<Invoice> getInvoices(){
        List<Invoice> invoices = Arrays.asList(
                new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
                new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
                new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
        );
        return invoices;
    }
}
