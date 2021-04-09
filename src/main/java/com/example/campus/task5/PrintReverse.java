package com.example.campus.task5;

public class PrintReverse {

    public static void main(String s[])
    {
        printReverse("gangnam");

    }


    public static void printReverse(String input) {
        String revers = new StringBuilder(input).reverse().toString();
        System.out.println(revers);
    }
}
