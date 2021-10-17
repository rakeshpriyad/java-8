package com.test.stream.reduce;

import com.test.base.list.BaseList;
import com.test.entity.Invoice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Reduce extends BaseList {
    public void sumOfIntegers(){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1st argument, init value = 0
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);

        System.out.println("sum : " + sum); // 55
    }
    public void sumOfIntegers1() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(numbers).reduce(0, Integer::sum); // 55
        System.out.println(sum);
    }
    public void maxOfIntegers1() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b); // 55
        System.out.println(sum);
    }

    public void maxOfIntegers2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(numbers).reduce(0, Integer::max); // 55
        System.out.println(sum);
    }

    public BigDecimal calculatePrice(){
        List<Invoice> invoices = getInvoices();
        BigDecimal sum = invoices.stream()
                .map(x -> x.getQty().multiply(x.getPrice()))    // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);      // reduce
      return sum;
    }
}
