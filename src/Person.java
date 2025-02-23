/*CS103_SALARZON*/
// Defining Person class
public class Person {
    // Private attributes for encapsulation
    private String name;
    private int age;
    private String address;

    // Constructor to initialize Person attributes
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods to retrieve attribute values
	    public String getName() {
	        return name;
	    }
	
	    public int getAge() {
	        return age;
	    }
	
	    public String getAddress() {
	        return address;
	    }

    // Setter methods to modify attribute values
	    public void setName(String name) {
	        this.name = name;
	    }
	
	    public void setAge(int age) {
	        this.age = age;
	    }
	
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    
   // Main method - entry point of the program
   public static void main(String[] args) {
        // Creating five Person instances (Using array to for easier maintenance)
	    // 
	      Person[] people = {
	              new Person("Charles", 20, "Cainta, Rizal"),
	              new Person("Kimberly", 21, "Tagaytay, Cavite"),
	              new Person("David", 25, "San Jose, Antique"),
	              new Person("Evelynn", 28, "Legazpi City, Albay"),
	              new Person("Anna", 30, "Danao City, Cebu")
	          };

	      	  // Using loops to print out the name for less repetition
	      	  // Printing their names, ages and addresses
	          System.out.println("-------------------------------------------------------------");
	          System.out.println("|  PERSON  |       NAME      |  AGE  |        ADDRESS       |");
	          System.out.println("-------------------------------------------------------------");
	          
	          for (int i = 0; i < people.length; i++) {
	              System.out.printf("|  %-7d | %-15s |  %-4d | %-20s |\n",
	                      (i + 1), people[i].getName(), people[i].getAge(), people[i].getAddress());
	          }
	          
	          System.out.println("-------------------------------------------------------------");
        
	          /* Printing their names and ages only
	          System.out.println("--------------------------------------");
	          System.out.println("|  PERSON  |       NAME      |  AGE  |");
	          System.out.println("--------------------------------------");
	          
	          for (int i = 0; i < people.length; i++) {
	              System.out.printf("|  %-7d | %-15s |  %-4d |\n",
	                      (i + 1), people[i].getName(), people[i].getAge());
	          }
	          
	          System.out.println("--------------------------------------");*/

    }
}