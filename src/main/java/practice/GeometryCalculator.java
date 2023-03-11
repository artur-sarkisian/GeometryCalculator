package practice;


public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    // площадь круга находим по формуле πr^2 - r радиус
    public static double getCircleSquare(double radius) {
        return radius < 0 ? -1 : Math.PI * Math.pow(radius, 2);
    }
    // для расчет объема шара используем формулу: V = 4/3πr^3 - где r радиус
    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        double sphereVolume = (4.0/3) * (Math.PI * Math.pow(radius, 3));
        return radius < 0 ? -1 : sphereVolume;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        double maxSide = Math.max(a, Math.max(b, c));
        double minSide = Math.min(a, Math.min(b, c));
        double middleSide = (a + b + c) - maxSide - minSide;
        return (minSide + middleSide) > maxSide;
    }
    // формула площади треугольника S = √p(p-a)(p-b)(p-c) где p - полупериметр (a + b + c) / 2
    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        double areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return isTrianglePossible(a, b, c) ? areaTriangle : - 1.0;
    }
}
