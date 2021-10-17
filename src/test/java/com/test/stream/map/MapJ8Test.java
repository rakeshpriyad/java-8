package com.test.stream.map;

import com.test.entity.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MapJ8Test {
    @Test
    public void convertTosStringListTest() {
        MapJ8 mapJ8 = new MapJ8();
        List<String> empNameList = mapJ8.convertTosStringList(mapJ8.getEmployees());
        mapJ8.displayNames(empNameList);
        Assert.assertNotNull(empNameList);
    }

    @Test
    public void convertTosOtherListTest() {
        MapJ8 mapJ8 = new MapJ8();
        List<Person> personList = mapJ8.convertToOtherList(mapJ8.getEmployees());
        mapJ8.displayPerson(personList);
        Assert.assertNotNull(personList);
    }

    @Test
    public void convertFromListTosMapTest() {
        MapJ8 mapJ8 = new MapJ8();
         mapJ8.convertListToMap(mapJ8.getEmployees());
    }

    @Test
    public void convertFromListTosMap1Test() {
        MapJ8 mapJ8 = new MapJ8();
        mapJ8.convertListToMap1(mapJ8.getEmployees());
    }

    @Test
    public void convertFromListTosMapSortedTest() {
        MapJ8 mapJ8 = new MapJ8();
        mapJ8.convertListToMapSorted(mapJ8.getEmployees());
    }
}
