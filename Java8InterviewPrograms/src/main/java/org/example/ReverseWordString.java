package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordString {
    public static void main(String[] args) {
        String input =  "Hello this is the word";
        String[] words =  input.split(" ");
//        Arrays.stream(words).sorted(Comparator.reverseOrder()).
//                collect(Collectors.toList()).forEach( word -> System.out.println(word));
        List<Stream<String>> list =  Arrays.stream(words).map(word -> Arrays.stream(word.split(""))
                        .sorted(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        list.forEach( val -> System.out.println(val.collect(Collectors.joining())));
        String result = Arrays.stream(words).map(word -> new StringBuilder(word).reverse().append(" ").toString())
                .collect(Collectors.joining());
        System.out.println(result);

    }
}
