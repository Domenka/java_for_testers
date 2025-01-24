package ru.stqa.geometry.figures;

public record Rectangle (double a, double b ) {
    public Rectangle {
        if (a < 0 || b < 0 ) {
            throw new IllegalArgumentException("Rectangle's side should be not a negative");
        }
    }


    public static void printRectangleArea(double a, double b) {
        System.out.println(String.format(
                "Площадь прямоугольника со стороной %f и  %f  = %f",a, b, RectangleArea(a, b)));
    }

    public static double RectangleArea(double a, double b) {
        return a * b;
    }
}
