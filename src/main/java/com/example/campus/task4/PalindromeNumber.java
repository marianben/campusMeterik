package com.example.campus.task4;
/*

Write a program to find if the given number is palindrome.
 A palindrome number which when reversed will be the same as original.
 */
public class PalindromeNumber {
    public static void main(String[] args) {

        boolean palindrome = isPalindrome(1221);

        if(palindrome)
            System.out.println("1221 is a palindrome.");
        else
            System.out.println("1221 is not a palindrome.");

    }

    public static boolean isPalindrome(int number)
    {
        boolean result = false;
        String inputNumber = String.valueOf(number);
        String reversNumber = new StringBuilder(inputNumber).reverse().toString();
        if(inputNumber.equals(reversNumber)){
            result=true;
        }else {
            return  result;
        }

        return result;
    }

}
