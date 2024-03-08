import java.util.Scanner;

class Shape {

    // Method to calculate the area of a circle
    public static float area(float radius) {
        float a1 = (float) (3.14 * radius * radius);
        System.out.println("area of circle" + a1);
    }

    // Method to calculate the area of a rectangle
    public static float area(float length, float width) {
        float a2 = (float) (length*width));
        System.out.println("area of rectangle " + a2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the circle
        System.out.print("Enter the radius of the circle: ");
        float radius = scanner.nextFloat();

        // Input for the rectangle
        System.out.print("Enter the length of the rectangle: ");
        float length = scanner.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float width = scanner.nextFloat();

        // Calculate and display the area of the circle
        // System.out.println("Area of the circle: " + Shape.area(radius));

        // Calculate and display the area of the rectangle
        // System.out.println("Area of the rectangle: " + Shape.area(length, width));
        Shape c1 = new Shape();
        // Shape c2 = new Shape();
        // Calculate and display the area of the circle
        c1.area(radius);

        // Calculate and display the area of the rectangle
        c1.area(length, width);
        // c1.area(radius);
        // c2.area(length, width);
        scanner.close();

    }
}