package com.example.campus.task5;
/*

Write a program to print the following character formation using the input String.
 Spaces in between characters are important.
  Use System.out.println or System.out.print for printing.
 */
public class PrintFormationWords {

    public static void main(String[] args) {

        printFormation("antartica");

    }

    public static void printFormation(String name){
        int lengthInputName = name.length();
        for (int i = 0; i <=lengthInputName-1; i++) {
            for (int j =0; j <=i ; j++) {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println();
        }
    }

}
