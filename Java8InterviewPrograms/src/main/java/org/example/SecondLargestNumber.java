package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(26, 74, 12, 58, 37);
        Optional<Integer> val = list.stream().distinct().
                sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if(val.isPresent()) {
            System.out.println(val.get());
        }else{
            System.out.println("invalid input");
        }
    }

}
