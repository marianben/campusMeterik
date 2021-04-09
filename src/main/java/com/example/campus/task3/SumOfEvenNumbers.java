package com.example.campus.task3;
/*

Write a program to find the sum of all even numbers till a given number.
 */
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of even numbers till 15 is " + sum_of_even_numbers(15));
    }
    
    public static int sum_of_even_numbers(int input)
    {
        int output = 0;
        for (int i = 2; i <=input ; i+=2) {
            output=output +i;

        }

        return output;
    }
}
