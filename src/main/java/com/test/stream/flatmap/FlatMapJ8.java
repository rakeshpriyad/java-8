package com.test.stream.flatmap;

import com.test.base.list.BaseList;
import com.test.entity.Employee;
import com.test.entity.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapJ8 extends BaseList {

public String[] flatStringArray(){
    String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

    // Java 8
    String[] result = Stream.of(array)  // Stream<String[]>
            .flatMap(Stream::of)        // Stream<String>
            .toArray(String[]::new);    //
    return result;
}



}