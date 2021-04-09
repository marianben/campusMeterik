package com.example.campus.task5;

public class PrintFormationWithDog {

    public static void main(String[] args) {

        printFormation(4);


    }

    public static void printFormation(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" "+ " ");
            }

            if (i == size - 1) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i+ " ");
                }
            } else  if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print("@ ");
                }
            }

            System.out.println();
        }

    }

}

