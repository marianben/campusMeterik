package com.example.campus.task1;
/*
Write a program to check if a given number is prime number or not?
A prime number (or a prime) is a natural number greater than 1 that has
no positive divisors other than 1 and itself. For eg. 3, 5, 7, 11, 13 are
prime numbers where as 2, 4, 9, 15 are not.
 */

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(prime(3) ? "37 is prime" : "37 is not prime");
    }

    public static boolean prime(int input)
    {
        boolean result = false;
        int count =0;
        for (int i =input; i>0; i--){
            if(input%i==0){
                count++;
            }
            if (count < 3) {
                result=true;
            }else {
                result=false;
            }
            }
        return result;
    }
}
