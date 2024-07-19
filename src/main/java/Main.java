import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three sides of the triangle
        System.out.print("Enter side1 of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 of the triangle: ");
        double side3 = input.nextDouble();

        // Prompt the user to enter a color
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        // Prompt the user to enter whether the triangle is filled
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Create a Triangle object with these sides
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display the area, perimeter, color, and true/false filled
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("The triangle is " + (triangle.isFilled() ? "filled" : "not filled"));
    }
}
