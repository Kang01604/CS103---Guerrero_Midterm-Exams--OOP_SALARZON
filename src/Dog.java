/*CS103_SALARZON*/
// Defining Dog class
public class Dog {
    // Private attributes to ensure encapsulation
    private String dogName;
    private String dogBreed;

    // Constructor to initialize Dog attributes
    public Dog(String dogName, String dogBreed) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
    }

    // Getter methods to retrieve the dog's name and breed
	    public String getName() {
	        return dogName;
	    }
	    
	    public String getBreed() {
	        return dogBreed;
	    }

    // Setter methods to update the dog's name and breed
	    public void setName(String name) {
	        this.dogName = name;
	    }
	
	    public void setBreed(String breed) {
	        this.dogBreed = breed;
	    }

	// Main method - entry point of the program
    public static void main(String[] args) {
        // Creating two Dog objects with initial values
        Dog dog1 = new Dog("Scooby", "Great Dane");
        Dog dog2 = new Dog("Peabody", "Beagle");

        // Printing the initial values
        System.out.println("-------------------------------------");
        System.out.println("|  DOG'S NAME   |       BREED       |");
        System.out.println("----------------------------------");
        System.out.printf("|  %-12s | %-17s |\n", dog1.getName(), dog1.getBreed());
        System.out.printf("|  %-12s | %-17s |\n", dog2.getName(), dog2.getBreed());
        System.out.println("-------------------------------------");
        
        // Updating the values using setter methods
        dog1.setName("Pluto");
        dog2.setName("Spike");

        dog1.setBreed("Bloodhound");
        dog2.setBreed("Bulldog");
        
        // Printing the updated values
        System.out.println("\nMODIFIED ATTRIBUTES AFTER USING SETTER METHODS:");
        System.out.println("-------------------------------------");
        System.out.println("|  DOG'S NAME   |       BREED       |");
        System.out.println("----------------------------------");
        System.out.printf("|  %-12s | %-17s |\n", dog1.getName(), dog1.getBreed());
        System.out.printf("|  %-12s | %-17s |\n", dog2.getName(), dog2.getBreed());
        System.out.println("-------------------------------------");

    }
} 