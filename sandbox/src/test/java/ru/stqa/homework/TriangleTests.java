package ru.stqa.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void CaclculatePerimeter(){
        var t = new Triangle(3.0,4.0, 5.0);
        var result = t.perimeter();
        Assertions.assertEquals(12, result);
    }

    @Test
    void CalculateArea() {
        var t = new Triangle(3.0,4.0, 5.0);
        var result = t.area();
        Assertions.assertEquals(6.0, result);
    }

}
