package com.example.campus.task4;
/*

Write a program to print the following number and symbol formation depending upon input size.
 Use System.out.println or System.out.print for printing.
 */
public class PrintFormationWhithNumber {
    public static void main(String[] args) {
        printFormation(5);
    }
    public static void printFormation(int size){
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2==0) {
                    System.out.print(j+" " );
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
