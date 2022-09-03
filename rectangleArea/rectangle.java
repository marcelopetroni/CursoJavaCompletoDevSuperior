public class rectangle {
    public double side1;
    public double side2;

    public double area() {
        return side1 * side2;
    }
    public double perimeter() {
        return side1 + side1 + side2 + side2;
    }
    public double diagonal() {
        return Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }

    public String toString() {
        return 
        "\nArea: " + area()
        + "\nPerimeter: " + perimeter()
        + "\nDiagonal: " + diagonal();
    }
}