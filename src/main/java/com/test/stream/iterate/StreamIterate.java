package com.test.stream.iterate;

import java.util.stream.Stream;

public class StreamIterate {
    public void iterate1(){
        Stream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(x -> System.out.println(x));

    }

    public void iterate2(){
        //Java9
     //   Stream.iterate(1, n -> n < 20 , n -> n * 2)
      //          .forEach(x -> System.out.println(x));
    }



    public void oddNumbers(){
        Stream.iterate(0, n -> n + 1)
                .filter(n-> n%2 !=0)
                .limit(10)
                .forEach(x -> System.out.println(x));
    }

    public void fibonacci(){
        Stream.iterate(new int[] {0,1}, n -> new int[] {n[1], n[0]+n[1]})
                .limit(10)
                .map(n->n[0])
                .forEach(x -> System.out.println(x));
    }

    public int sumOfFibonacci(){
        int sum =Stream.iterate(new int[] {0,1}, n -> new int[] {n[1], n[0]+n[1]})
                .limit(10)
                .map(n->n[0])
                .mapToInt(n -> n)
                .sum();
        return sum;
    }
}
