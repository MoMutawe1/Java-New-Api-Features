package com.javanewapi.g;

public class TextBlocksRunner {
    public static void main(String[] args) {
        // Text Block was introduced in Java15.
        // First Line has “”” followed by line terminator, so you can't have TextBlock in a single line.
        System.out.println("""
                        This is a "Text Block" *_* :) @-@ #_#
                        New Line 1
                           'New Line 2'
                              "New Line 3"
                           'New Line 4'
                        New Line 5
                        """
        );

        String textBlock = """
                Line 1: %s
                Line 2: %s
                Line 3
                Line 4
                """.formatted("Some Value.", "Some Other Value.");
        System.out.println(textBlock);
    }
}
