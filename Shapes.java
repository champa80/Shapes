public class Shapes {
   
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
  
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    
    public static void main(String[] args) {
        double base = 5;
        double height = 8;
        double length = 10;
        double width = 6;
        double radius = 4;
       
        System.out.println("Area of triangle: " + calculateTriangleArea(base, height));
        System.out.println("Area of rectangle: " + calculateRectangleArea(length, width));
        System.out.println("Area of circle: " + calculateCircleArea(radius));
        System.out.println("Area of square: " + calculateSquareArea(length));
    }
}
