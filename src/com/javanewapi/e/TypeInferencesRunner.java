package com.javanewapi.e;

import java.util.List;

public class TypeInferencesRunner {
    public static void main(String[] args) {
        List<String> names1 = List.of("Mo", "Suna");
        List<String> names2 = List.of("Temo", "Meme");
        List<List<String>> family= List.of(names1,names2);

        //Starting from Java 10 TypeInference is introduced to simplify complex types.
        var myfamily = List.of(names1,names2);
        System.out.println(myfamily);

        var var = 12;  // var is NOT a Keyword, you can have a variable called 'var' as well.
        //var var1 = null; // You can NOT assign null to type var.

    }
}
