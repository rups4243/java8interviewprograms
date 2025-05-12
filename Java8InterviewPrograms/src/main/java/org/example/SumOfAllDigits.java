package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int num = 63635;
        String numinstring = String.valueOf(num);
        String[] numsplitted = numinstring.split("");
        int result = Stream.of(numsplitted).map(val -> Integer.parseInt(val)).
                mapToInt(Integer::intValue).sum();

        System.out.println(result);
    }
}
