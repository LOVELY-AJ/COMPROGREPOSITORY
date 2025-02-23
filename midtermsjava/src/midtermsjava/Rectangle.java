package midtermsjava;

public class Rectangle {
	
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return Math.round(width * height * 100.0) / 100.0;
    }

    public double calculatePerimeter() {
        return Math.round(2 * (width + height) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.9, 9.8);

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}