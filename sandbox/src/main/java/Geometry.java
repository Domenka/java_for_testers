public class Geometry {
    public static void main(String[] args) {
        printSquareArea(5.2);
        printSquareArea(12.0);
        printSquareArea(2.8);

        printRectangleArea(3.0,5.0);
    }

    private static void printRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со стороной " + a + " и " +b + " = " + RectangleArea(a, b));
    }

    private static double RectangleArea(double a, double b) {
        return a * b;
    }


    static void printSquareArea(double a) {
        System.out.println("Площадь квадрата со стороной " + a + " = " + SquareArea(a));

    }

    private static double SquareArea(double a) {
        return a * a;
    }
}
