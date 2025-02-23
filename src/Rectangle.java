public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50, 80);
        
        System.out.println("\nRectangle Dimensions:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println ("Height: " + rectangle.getLength());
        
        System.out.println("\nArea of Rectangle (W x L) | " + rectangle.getArea());
        System.out.println("----------------------");
        System.out.println("|                    |");
        System.out.printf("|       %-12.2f |\n", rectangle.getArea());
        System.out.println("|                    |");
        System.out.println("----------------------\n");

        System.out.println("Perimeter of rectangle (2*(W+L)) | " + rectangle.getPerimeter());
        System.out.println(" ----------------------- ");
        System.out.println("|  -------------------  |");
        System.out.println("|  |                 |  |");
        System.out.println("|  |                 |  |");
        System.out.println("|  -------------------  |");
        System.out.printf(" -------- %.2f -------- \n", rectangle.getPerimeter());
    }
} 

