package ru.stqa.homework;

public record Triangle (double a, double b, double c) {

    public double perimeter() {
        return a+b+c;
    }

    public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
