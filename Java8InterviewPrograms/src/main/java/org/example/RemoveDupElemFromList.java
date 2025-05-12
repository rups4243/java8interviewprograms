package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupElemFromList {
    public static void main(String[] args) {
        List<Character> list  = Arrays.asList('A','A','B','B','C','C');
        Set<Character> set =  list.stream().collect(Collectors.toSet());
        System.out.println(set);


        List<Character> uniquelist =  list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniquelist);

    }
}
