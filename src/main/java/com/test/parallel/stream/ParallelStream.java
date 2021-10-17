package com.test.parallel.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }

    public long primeCount(){
        long count = Stream.iterate(0, n -> n + 1)
                .limit(1_000_000)
                //.parallel()   with this 23s, without this 1m 10s
                .filter(ParallelStream::isPrime)
                .peek(x -> System.out.format("%s\t", x))
                .count();
        return count;
    }

    public long primeCountParallel(){
        long count = Stream.iterate(0, n -> n + 1)
                .limit(1_000_000)
                .parallel()   //with this 23s, without this 1m 10s
                .filter(ParallelStream::isPrime)
                .peek(x -> System.out.format("%s\t", x))
                .count();
        return count;
    }

}
