package com.javanewapi.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Suna");
        names.add("Temo");
        names.add("Meme");

        doNotChange(names);  // modifying the list here is allowed without using the copyOf() method.
        System.out.println(names);

        //of() - Since Java 9
        //If you have a static list where you know the exact values, hardcoded values.
        //Return unmodifiable list containing a specific set of elements.
        System.out.println(List.of("Suna", "Temo", "Meme"));

        //copyOf() - Since Java 10 for List, Set & Map.
        //Return unmodifiable list of given collection.
        List<String> copyOfNames = List.copyOf(names);
        doNotChange(copyOfNames);  // modifying the list here is NOT allowed and will throw an exception.
    }

    public static void doNotChange(List<String>names){
        names.add("NewName");
    }
}
