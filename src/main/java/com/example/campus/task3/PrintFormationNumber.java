package com.example.campus.task3;

/*
Write a program to print the following formation depending upon size of the matrix.
Use System.out.println or System.out.print for printing.
 */
public class PrintFormationNumber {

    public static void main(String[] args) {

        printFormation(4);
    }
    public static void printFormation(int size) {

        for (int i = 1; i <=size; i++) {

            for (int j = 0; j>=i; j--){
                System.out.print("");

            }
            for (int k = 0; k <i; k++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }

}
