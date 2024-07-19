public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /** Construct a default triangle */
    public Triangle() {
    }

    /** Construct a triangle with specified sides */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** Return side1 */
    public double getSide1() {
        return side1;
    }

    /** Return side2 */
    public double getSide2() {
        return side2;
    }

    /** Return side3 */
    public double getSide3() {
        return side3;
    }

    /** Return area of this triangle */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Return perimeter of this triangle */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Return a string description for the triangle */
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
          " side3 = " + side3;
    }
}
