package com.example.campus.task2;
/*

Write a program to convert between celsius and fahrenheit.
Note that 'C = 5(F - 32)/9'
 */
public class CelsiusToFahrenHeit {
    public static void main(String[] args) {

        System.out.println("98.4 degrees fahrenheit is same as " + fahrenheitToCelsius(98.4) + " celsius");
        System.out.println("100 degrees celsius is same as " + celsiusToFahrenheit(100) + " fahrenheit");
        System.out.println("-40 degrees celsius is same as " + celsiusToFahrenheit(-40) + " fahrenheit");


    }
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        double celsius = 0;
       celsius = 5*(fahrenheit-32)/9;

        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius)
    {
        double fahrenheit = 0;
        fahrenheit= (celsius*1.800000) + 32;

        return fahrenheit;
    }
}
