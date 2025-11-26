public class Shape {

    // Method Overloading 
    
    int area(int side) {
        return side * side;
    }

    int area(int l, int b) {
        return l * b;
    }

    double area(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.println("Square: " + s.area(5));
        System.out.println("Rectangle: " + s.area(5, 6));
        System.out.println("Circle: " + s.area(3.5));
    }
}