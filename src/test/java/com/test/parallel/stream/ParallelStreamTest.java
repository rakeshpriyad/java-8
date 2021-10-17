package com.test.parallel.stream;

import org.junit.Test;

public class ParallelStreamTest {
    @Test
    public void primeCountTest() {
        ParallelStream ps = new ParallelStream();
        long count = ps.primeCount();
        System.out.println(count);
    }

    @Test
    public void primeCountParallelTest() {
        ParallelStream ps = new ParallelStream();
        long count = ps.primeCountParallel();
        System.out.println(count);
    }
}
