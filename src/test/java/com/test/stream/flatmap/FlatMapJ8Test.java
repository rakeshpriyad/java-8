package com.test.stream.flatmap;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class FlatMapJ8Test {
    @Test
    public void convertTosStringListTest() {
        FlatMapJ8 flatMapJ8 = new FlatMapJ8();
        String[] str = flatMapJ8.flatStringArray();
        System.out.println(str);
        Arrays.stream(str).forEach(System.out::println);
    }

    @Test
    public void flatMapSumOfLineItems() {
        FlatMapJ8 flatMapJ8 = new FlatMapJ8();
        BigDecimal sumOfLineItem = flatMapJ8.sumOfOrderLineItem();
        System.out.println(sumOfLineItem);
    }

    @Test
    public void flatMapSumOfOrder() {
        FlatMapJ8 flatMapJ8 = new FlatMapJ8();
        BigDecimal sumOfOrder = flatMapJ8.sumOfOrder();
        System.out.println(sumOfOrder);
    }
}
