package com.test.file;

import org.junit.Test;

import java.util.List;

public class FileReaderTest {
    @Test
    public void testFileRead(){
        String fileName="C:\\Java\\Projects\\java-8\\src\\main\\resources\\file1.txt";
        FileReader reader = new FileReader();
        List<String> list =reader.read(fileName);
        list.stream().forEach(System.out::println);

    }

    @Test
    public void testFileReadBufferedReader(){
        String fileName="C:\\Java\\Projects\\java-8\\src\\main\\resources\\file1.txt";
        FileReader reader = new FileReader();
        String lines =reader.readLines(fileName);
        System.out.println(lines);

    }
}