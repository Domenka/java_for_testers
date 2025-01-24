package ru.stqa.homework;

public record Triangle (double a, double b, double c) {

    public Triangle {
        if (a < 0 || b < 0 || c < 0 ) {
            throw new IllegalArgumentException("Triangle's side cannot be a negative");
        } else if (a + b < c || a + c < b || c + b < a) {
            throw new IllegalArgumentException("Sum of sides cannot be less than third side");
        }
    }

    public double perimeter() {
        return a+b+c;
    }

    public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
