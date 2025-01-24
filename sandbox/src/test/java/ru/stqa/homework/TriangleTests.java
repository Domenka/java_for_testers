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

    @Test
    void cannotCreateTrangleWithNegativeSideA () {
        try {
            new Triangle(-3.0, 4.0, 5.0);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception) {

        }
    }
    @Test
    void cannotCreateTrangleWithNegativeSideB () {
        try {
            new Triangle(3.0, - 4.0, 5.0);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void cannotCreateTrangleWithNegativeSideC () {
        try {
            new Triangle(3.0, 4.0, -5.0);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void cannotCreateTrangleWithSumLessThanLastSide() {
        try {
            new Triangle(3.0, 4.0, 8.0);
            Assertions.fail();
        }
        catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void testEquality() {
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(4.0,5.0,3.0);
        Assertions.assertTrue(t1.equals(t2));
    }

}


