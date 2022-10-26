package com.javanewapi.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/sample.txt");
        //readString() - introduced in Java 11
        //Reads all content from a file into a string, decoding from bytes to characters using the UTF-8 charset.
        String fileContent = Files.readString(path);
        System.out.println(fileContent);

        String newFileContent = fileContent.replace("line", "index");
        Path newFilePath = Paths.get("./resources/new-sample.txt");
        //writeString() - introduced in Java 11
        //Write a CharSequence to a file. Characters are encoded into bytes using the UTF-8 charset.
        Files.writeString(newFilePath, newFileContent);
    }
}
