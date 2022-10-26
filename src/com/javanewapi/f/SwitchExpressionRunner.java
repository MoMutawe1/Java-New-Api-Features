package com.javanewapi.f;

public class SwitchExpressionRunner {

    public static String findDayOfTheWeek(int day){
        String dayOfWeek="";
        switch (day){
            case 1: dayOfWeek="Monday";
                    break;
            case 2: dayOfWeek="Tuesday";
                    break;
            case 3: dayOfWeek="Wednesday";
                    break;
            case 4: dayOfWeek="Thursday";
                    break;
            case 5: dayOfWeek="Friday";
                    break;
            default: throw new IllegalArgumentException("Invalid Option: "+day);
        }
        return dayOfWeek;
    }

    // Switch Expression was introduced in Java 14.
    // Remember that there's No Fallthrough in Switch Expression so no need for break statement at the end.
    public static String findDayOfTheWeekWithSwitchExpression(int day){
        String dayOfWeek = switch (day){
            case 1 -> {
                System.out.println("printing some statements..");
                yield "Monday";  // you can use 'yield' statement to return a value in case you have multiLines expression.
            }
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default-> throw new IllegalArgumentException("Invalid Option: "+day);
        };
        return dayOfWeek;
    }

    public static void main(String[] args) {


    }

}
