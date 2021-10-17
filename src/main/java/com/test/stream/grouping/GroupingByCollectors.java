package com.test.stream.grouping;

import com.test.base.list.BaseList;
import com.test.entity.Item;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCollectors extends BaseList {
    public void groupingExample(){
        List<String> items = getFruits();

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result);
    }

    public void groupingExample1(){
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        Map<String, Long> finalMap = new LinkedHashMap<>();
        result.entrySet().stream().sorted(Map.Entry.<String, Long> comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);
    }

    public void groupingExample2(){
        List<Item> items = getItem();

        Map<String, Integer> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Item::getName, Collectors.summingInt(Item::getQty)
                        )
                );

        System.out.println(result);
    }


    public void groupingByPrice(){
        List<Item> items = getItem();

        Map<BigDecimal, List<Item>> result = items.stream().collect(
                Collectors.groupingBy(
                        Item::getPrice
                )
        );

        System.out.println(result);
    }

    public void groupingByPrice1(){
        List<Item> items = getItem();

        // group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<String>> result =
                items.stream().collect(
                        Collectors.groupingBy(Item::getPrice,
                                Collectors.mapping(Item::getName, Collectors.toSet())
                        )
                );

        System.out.println(result);

    }

}
