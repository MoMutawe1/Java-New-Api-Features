package com.javanewapi.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

    public static boolean isEven(Integer number){
        return number%2==0;
    }

    public static void main(String[] args) {
        //Predicate is a functional interface whose functional method is test(Object).
        //Introduced in Java 8
        List<Integer> numbers = List.of(7, 11, 18, 24, 33, 40);
        Predicate<Integer> evenNumberPredicate = number -> number%2==0;
        //negate() - Returns a predicate that represents the logical negation of this predicate.
        //negate() introduced in Java 11
        numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);

        //.not - Returns a predicate that is the negation of the supplied predicate.
        //This is accomplished by returning result of the calling target.negate().
        //.not introduced in Java 11
        numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
    }
}
