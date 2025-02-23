public class Dog {
    private String dogName;
    private String dogBreed;

    public Dog(String dogName, String dogBreed) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
    }

    public String getName() {
        return dogName;
    }

    public void setName(String name) {
        this.dogName = name;
    }

    public String getBreed() {
        return dogBreed;
    }

    public void setBreed(String breed) {
        this.dogBreed = breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Scooby", "Great Dane");
        Dog dog2 = new Dog("Peabody", "Beagle");

        System.out.println("-------------------------------------");
        System.out.println("|  DOG'S NAME   |       BREED       |");
        System.out.println("----------------------------------");
        System.out.printf("|  %-12s | %-17s |\n", dog1.getName(), dog1.getBreed());
        System.out.printf("|  %-12s | %-17s |\n", dog2.getName(), dog2.getBreed());
        System.out.println("-------------------------------------");
        
        dog1.setName("Pluto");
        dog1.setBreed("Spike");

        dog2.setName("Bloodhound");
        dog2.setBreed("Bulldog");
        
        System.out.println("\nMODIFIED ATTRIBUTES AFTER USING SETTER METHODS:");
        System.out.println("-------------------------------------");
        System.out.println("|  DOG'S NAME   |       BREED       |");
        System.out.println("----------------------------------");
        System.out.printf("|  %-12s | %-17s |\n", dog1.getName(), dog1.getBreed());
        System.out.printf("|  %-12s | %-17s |\n", dog2.getName(), dog2.getBreed());
        System.out.println("-------------------------------------");

    }
} 