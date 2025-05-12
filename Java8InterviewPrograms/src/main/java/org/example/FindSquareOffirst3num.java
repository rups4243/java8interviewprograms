package org.example;

import java.util.Arrays;
import java.util.List;

public class FindSquareOffirst3num {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,53,8,47,2,78,25,42,12);
        int sum =  numbers.stream().filter(num -> num %2 == 0).limit(3).
                map( val -> val * val).
                mapToInt(Integer::intValue).
                sum();
        System.out.println(sum);

    }
}
