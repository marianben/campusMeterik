package com.example.campus.task1;
//Calculate Factorial
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of is "+ factorial(5));
    }

    public static int factorial(int number){
        int result =1;
        if(number<=0){
            return result=0;
        }else {
            for (int i = 1; i <= number; i++) {
                result = result*i;
            }
        }
        return result;
    }
}
