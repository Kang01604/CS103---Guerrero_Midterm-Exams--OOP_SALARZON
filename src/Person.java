// Define the Person class
public class Person {
    // Declare private variables for name, age, and address
    private String name;
    private int age;
    private String address;

    // Constructor for the Person class that initializes name, age, and address
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
   public static void main(String[] args) {
        // Creating five Person objects
        Person p1 = new Person("Charles", 20, "Cainta, Rizal");
        Person p2 = new Person("Kimberly", 21, "Tagaytay, Cavite");
        Person p3 = new Person("David", 25, "San Jose, Antique");
        Person p4 = new Person("Evelynn", 28, "Legazpi City, Albay");
        Person p5 = new Person("Anna", 30, "Danao City, Cebu");

        // Printing their names and ages
        System.out.println("-------------------------------------------------------------");
        System.out.println("|  PERSON  |       NAME      |  AGE  |        ADDRESS       |");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("|  %-7s | %-15s |  %-4d | %-20s |\n", "1", p1.getName(), p1.getAge(), p1.getAddress());
        System.out.printf("|  %-7s | %-15s |  %-4d | %-20s |\n", "2", p2.getName(), p2.getAge(), p2.getAddress());
        System.out.printf("|  %-7s | %-15s |  %-4d | %-20s |\n", "3", p3.getName(), p3.getAge(), p3.getAddress());
        System.out.printf("|  %-7s | %-15s |  %-4d | %-20s |\n", "4", p4.getName(), p4.getAge(), p4.getAddress());
        System.out.printf("|  %-7s | %-15s |  %-4d | %-20s |\n", "5", p5.getName(), p5.getAge(), p5.getAddress());
        System.out.println("-------------------------------------------------------------");

    }
}