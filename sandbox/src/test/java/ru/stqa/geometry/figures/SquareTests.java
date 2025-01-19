package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void CanCalculateArea() {
        var s = new Square(5.0);
        var result = s.Area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void CaclucatePerimeter() {
       Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }
}
