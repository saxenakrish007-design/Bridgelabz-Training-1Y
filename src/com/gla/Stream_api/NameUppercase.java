package com.gla.Stream_api;
import java.util.*;
import java.util.stream.Collectors;
public class NameUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "anita", "vikas", "neha");
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        upperNames.forEach(System.out::println);
    }
}
