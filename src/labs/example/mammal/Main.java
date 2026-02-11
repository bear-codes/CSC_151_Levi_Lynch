/* 
Levi Lynch
2/4/26

*/

package labs.example.mammal;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setName("Buddy");

        System.out.println(dog.getName());

        dog.eat();
        dog.sleep();
        dog.bark();  // Only Dog can do this
    }
}

