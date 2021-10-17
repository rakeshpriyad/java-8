package com.test.stream.flatmap;

import com.test.base.list.BaseList;
import com.test.entity.Order;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapJ8 extends BaseList {

    public String[] flatStringArray() {
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Java 8
        String[] result = Stream.of(array)  // Stream<String[]>
                .flatMap(Stream::of)        // Stream<String>
                .toArray(String[]::new);    //

        return result;
    }

    public BigDecimal sumOfOrderLineItem() {
        List<Order> orders = this.findAllOrder();
        BigDecimal sumOfLineItems = orders.stream()
                .flatMap(order -> order.getLineItems().stream())    //  Stream<LineItem>
                .map(line -> line.getTotal())                       //  Stream<BigDecimal>
                .reduce(BigDecimal.ZERO, BigDecimal::add);          //  reduce to sum all
        return sumOfLineItems;
    }
    public BigDecimal sumOfOrder() {
        List<Order> orders = this.findAllOrder();
        BigDecimal sumOfOrder = orders.stream()
                .map(order -> order.getTotal())                     //  Stream<BigDecimal>
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        //  reduce to sum all
        return sumOfOrder;
    }



}