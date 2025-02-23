/*CS103_SALARZON*/
// Defining Rectangle class
public class Rectangle {
    // Private attributes to ensure encapsulation
    private double width;
    private double length;

    // Constructor to initialize Rectangle attributes
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Getter methods to retrieve width and length
	    public double getWidth() {
	        return width;
	    }
	    
	    public double getLength() {
	        return length;
	    }
	    
    // Method to calculate the area of the rectangle (Width × Length)
	    public double getArea() {
	        return width * length;
	    }
    
    // Method to calculate the perimeter of the rectangle (2 × (Width + Length))
	    public double getPerimeter() {
	        return 2 * (width + length);
	    }

    // Setter methods to update width and length
	    public void setWidth(double width) {
	        this.width = width;
	    }
	
	    public void setLength(double length) {
	        this.length = length;
	    }

    // Main method - entry point of the program
    public static void main(String[] args) {
    	
    	// Creating a Rectangle object with initial dimensions
    	Rectangle rectangle = new Rectangle(50, 80);
        
        // Printing initial dimensions
        System.out.println("\nRectangle Dimensions:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println ("Height: " + rectangle.getLength());
        
        // Displaying the calculated area 
        System.out.println("\nArea of Rectangle (W x L) | " + rectangle.getArea());
        System.out.println("----------------------");
        System.out.println("|                    |");
        System.out.printf("|       %-12.2f |\n", rectangle.getArea());
        System.out.println("|                    |");
        System.out.println("----------------------\n");

        // Displaying the calculated perimeter
        System.out.println("Perimeter of rectangle (2*(W+L)) | " + rectangle.getPerimeter());
        System.out.println(" ----------------------- ");
        System.out.println("|  -------------------  |");
        System.out.println("|  |                 |  |");
        System.out.println("|  |                 |  |");
        System.out.println("|  -------------------  |");
        System.out.printf(" -------- %.2f -------- \n", rectangle.getPerimeter());
    }
} 

