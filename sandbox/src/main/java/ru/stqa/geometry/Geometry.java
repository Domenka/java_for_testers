package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.2));
        Square.printSquareArea(new Square(12.0));
        Square.printSquareArea(new Square(2.8));

        Rectangle.printRectangleArea(3.0,5.0);
    }


}
