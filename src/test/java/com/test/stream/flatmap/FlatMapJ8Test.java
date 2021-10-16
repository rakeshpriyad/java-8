package com.test.stream.flatmap;

import com.test.entity.Person;
import com.test.stream.map.MapJ8;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlatMapJ8Test {
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
}
