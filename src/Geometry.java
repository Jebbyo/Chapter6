public class Geometry {

    public static double getCircleArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    public static double getRectangleArea(double length, double width) {
        return length * width;
    }

    public static double getTriangleArea(double base, double height) {
        return base * height * 0.5;
    }
}
