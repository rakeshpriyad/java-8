package com.test.stream.iterate;

import org.junit.Test;


public class StreamIterateTest {
    @Test
    public void iterateTest() {
        StreamIterate iterate = new StreamIterate();
        iterate.iterate1();
    }

    @Test
    public void oddNumberTest() {
        StreamIterate iterate = new StreamIterate();
        iterate.oddNumbers();
    }

    @Test
    public void fibonacciTest() {
        StreamIterate iterate = new StreamIterate();
        iterate.fibonacci();
    }

    @Test
    public void sumOfFibonacciTest() {
        StreamIterate iterate = new StreamIterate();
        int sum = iterate.sumOfFibonacci();
        System.out.println(sum);
    }
}
