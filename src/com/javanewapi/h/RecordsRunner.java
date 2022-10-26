package com.javanewapi.h;

/*
"Record" Released in JDK 16.
Eliminate verbosity in creating Java Beans, Public accessor methods, constructor, equals,
hashcode, and toString are automatically created.
but you can create custom implementation if you would want.

Compact Constructors are only allowed in Records.
 */
public class RecordsRunner {

    record Person(int id, String name, String email){
        Person {
        //You can remove the arguments and the assignment statements below to create a "Compact constructor".
        //So you can just add your validation here without warring about the boilerplate code.

        //Person(int id, String name, String email) {
            if (name == null)
                throw new IllegalArgumentException("name is null");
            //this.id == id;
            //this.name == name;
            //this.email == email;

        }
    }

    public static void main(String[] args) {
        Person x = new Person(44,"Gon", "hunter.gon@x.com");
        System.out.println(x);
    }
}
