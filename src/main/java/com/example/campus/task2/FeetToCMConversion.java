package com.example.campus.task2;

/*
Write code to convert a given number from feets (ft) to centi meters (cm).
Note that '1 foot = 0.3048 meters' and '1 meter = 100 centi meters'
 */
public class FeetToCMConversion {
    public static void main(String[] args) {
        System.out.println(" 25 feet is same as " + convertToCentiMeter(25) + " cm");
    }

    public static double convertToCentiMeter(double feet)
    {
        double result = 0;
        result= (feet* 0.30480)*100;

        return result;
    }
}
