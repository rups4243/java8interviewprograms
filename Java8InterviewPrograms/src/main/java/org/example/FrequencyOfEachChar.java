package org.example;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String input = "sdsdsdsdjddhfhfddbddd";
        LinkedHashMap<String, Long> resultMap = Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new, Collectors.counting()));
        System.out.println(resultMap);
    }
}
