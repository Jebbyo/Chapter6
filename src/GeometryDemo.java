import java.util.Scanner;
import java.util.StringTokenizer;

public class GeometryDemo {

    public static void main(String[] args) {
        int userInput;
        double radius;
        double length;
        double width;
        double base;
        double height;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the area of a Triangle");
            System.out.println("4. Quit \n");
            System.out.println("Enter your choice (1-4):");

            userInput = keyboard.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Enter the circle's radius.");
                    radius = keyboard.nextDouble();
                    System.out.println(radius >= 0 ? "The area of a circle with radius " + radius + " is " +
                            Geometry.getCircleArea(radius) + "." : "ERROR! The numbers you enter cannot be negative!");
                    break;
                case 2:
                    System.out.println("Enter the rectangle's length.");
                    length = keyboard.nextDouble();
                    System.out.println("Enter the rectangle's width.");
                    width = keyboard.nextDouble();
                    System.out.println(length >= 0 && width >= 0 ? "The area of a rectangle with length " + length + " and width " + width + " is " +
                            Geometry.getRectangleArea(length,width) + "." : "ERROR! The numbers you enter cannot be negative!");
                    break;
                case 3:
                    System.out.println("Enter the triangle's base.");
                    base = keyboard.nextDouble();
                    System.out.println("Enter the triangle's height.");
                    height = keyboard.nextDouble();
                    System.out.println(base >= 0 && height >= 0 ? "The area of a triangle with base " + base + " and height " + height + " is " +
                            Geometry.getTriangleArea(base,height) +"." : "ERROR! The numbers you enter cannot be negative!");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR! You must type a number within the range of 1-4.");
                    break;
            }
        }
    }
}
