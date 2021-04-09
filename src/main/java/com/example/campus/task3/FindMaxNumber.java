package com.example.campus.task3;
/*

Write a program to get the maximum value of 3 numbers.
 */
public class FindMaxNumber {
    public static void main(String[] args) {
        System.out.println("The maximum number in 3, 7 and 10 is " + maximum(3, 7, 10));
    }

    public static int maximum(int a, int b, int c)
    {
        int maximum = 0;

        if(a>=b&&a>=c){
            maximum = a;
        }else if (b>=a&&b>=c){
            maximum = b;
        }else {
            maximum=c;
        }


        return maximum;
    }
}
