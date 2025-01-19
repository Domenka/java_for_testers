package ru.stqa.geometry.figures;

public class Square {

    public static void printSquareArea(double a) {
        System.out.println(String.format(
                "Площадь квадрата со стороной %f = %f", a, SquareArea(a)));

    }

    public static double SquareArea(double a) {
        return a * a;
    }
}
