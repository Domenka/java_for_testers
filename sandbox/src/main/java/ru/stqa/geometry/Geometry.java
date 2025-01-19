package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(5.2);
        Square.printSquareArea(12.0);
        Square.printSquareArea(2.8);

        Rectangle.printRectangleArea(3.0,5.0);
    }


}
