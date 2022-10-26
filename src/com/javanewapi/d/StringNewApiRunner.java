package com.javanewapi.d;

class Sample{
    public String str;
}
public class StringNewApiRunner {
    public static void main(String[] args) {
        //.isBlank() - Returns true if the string is empty or contains only white space codepoints, otherwise false.
        //.isBlank() - Introduced in Java 11
        System.out.println("".isBlank());
        //.strip() - Returns a string whose value is this string, with all leading and trailing white space removed.
        //.strip() - Introduced in Java 11
        System.out.println(" str ".strip());
        System.out.println(" str ".stripLeading());
        System.out.println(" str ".stripTrailing());
        //.lines() - Returns a stream of lines extracted from this string, separated by line terminators like '\n'.
        //.lines() - Introduced in Java 11
        "Line1\nLine2\nLine3".lines().forEach(System.out::println);

        Sample sample = new Sample();
        sample = null;
        //Exception in thread "main" java.lang.NullPointerException: Cannot read field "str" because "sample" is null
        //at com.javanewapi.d.StringNewApiRunner.main(StringNewApiRunner.java:25)
        //So from (Java 14) the compiler is giving clear specific details about the null pointer exception.
        System.out.println(sample.str);
    }
}
