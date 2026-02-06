package src.labs.example.mammal;

public class Mammal {

    // Properties
    protected String hairColor;
    protected String eyeColor;
    protected String habitat;

    // Constructor (initializes properties)
    public Mammal(String hairColor, String eyeColor, String habitat) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.habitat = habitat;
    }

    // Prints mammal details
    public void getMammalDetails() {
        System.out.println("Mammal Details:");
        System.out.println("Hair Color: " + hairColor);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Habitat: " + habitat);
    }

    // Mammal sits for 15 seconds
    public void sit() {
        try {
            System.out.println("The mammal is sitting...");
            Thread.sleep(15000); // 15 seconds
            System.out.println("The mammal is done sitting.");
            stand(); // stand and bark after sitting
        } catch (InterruptedException e) {
            System.out.println("The mammal was interrupted while sitting.");
        }
    }

    // Mammal stands and barks
    public void stand() {
        System.out.println("The mammal is now standing.");
        bark();
    }

    // Barking behavior
    public void bark() {
        System.out.println("The mammal is barking!");
    }

    // Other behaviors (optional but fine to keep)
    public void eat() {
        System.out.println("The mammal is eating.");
    }

    public void sleep() {
        System.out.println("The mammal is sleeping.");
    }
}
