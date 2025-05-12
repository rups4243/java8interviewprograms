package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class MaxMinNumber {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(62,68,12,58,374,73);
        Integer min = listOfInteger.stream().sorted().findFirst().get();
        Integer max = listOfInteger.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("max: "+ max + "   Min:"+min);

        Integer mx = listOfInteger.stream().mapToInt(Integer::intValue).max().getAsInt();
        Integer mn = listOfInteger.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("max: "+ mx + "   Min:"+mn);
    }
}
