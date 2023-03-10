package practice;

import net.sf.saxon.expr.Component;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        return radius < 0 ? -1 : Math.PI * Math.pow(radius, 2);
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        return 0.0;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        return 0.0;
    }
}
