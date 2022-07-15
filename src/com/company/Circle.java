package com.company;

public class Circle{

    private static void area(double radius){
        double area = Math.PI * (radius * radius);
        System.out.println("area: " + area);
    }
    private static void circumference (double radius){
        double circumference = Math.PI * 2 * radius;
        System.out.println("circumference: " + circumference) ;
    }
    public static void main(String args[]) {
        area(100);
        circumference(100);

    }
//    Circle деген класс тузунуз, анын PI деген свойствасы, area
//    жана circumference деген статик методдору болсун.
//    areaны табуу учун: PI * (radius * radius)
//    circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
}
