package ru.stqa.geometry.figures;

public record Rectangle (double a, double b ) {


    public static void printRectangleArea(double a, double b) {
        System.out.println(String.format(
                "Площадь прямоугольника со стороной %f и  %f  = %f",a, b, RectangleArea(a, b)));
    }

    public static double RectangleArea(double a, double b) {
        return a * b;
    }
}
