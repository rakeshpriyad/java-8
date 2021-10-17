package com.test.stream.reduce;

import org.junit.Test;

import java.math.BigDecimal;

public class ReduceTest {
    @Test
    public void sumOfIntegerTest(){
        Reduce r = new Reduce();
        r.sumOfIntegers1();
        r.sumOfIntegers();
    }
    @Test
    public void maxIntegerTest(){
        Reduce r = new Reduce();
        r.maxOfIntegers1();
        r.maxOfIntegers2();
    }

    @Test
    public void calculateTest(){
        Reduce r = new Reduce();
        BigDecimal price =r.calculatePrice();
        System.out.println(price);
    }
}
