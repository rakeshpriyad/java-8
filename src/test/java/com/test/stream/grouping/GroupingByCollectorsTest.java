package com.test.stream.grouping;

import org.junit.Test;

public class GroupingByCollectorsTest {
    @Test
    public void groupingExampleTest(){
        GroupingByCollectors grouping = new GroupingByCollectors();
        grouping.groupingExample();

    }
    @Test
    public void groupingExample1Test(){
        GroupingByCollectors grouping = new GroupingByCollectors();
        grouping.groupingExample1();
    }

    @Test
    public void groupingExample2Test(){
        GroupingByCollectors grouping = new GroupingByCollectors();
        grouping.groupingByPrice();
    }

    @Test
    public void groupingByPriceTest(){
        GroupingByCollectors grouping = new GroupingByCollectors();
        grouping.groupingByPrice();
    }

    @Test
    public void groupingByPrice1Test(){
        GroupingByCollectors grouping = new GroupingByCollectors();
        grouping.groupingByPrice1();
    }

}
