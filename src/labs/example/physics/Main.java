/* 
Levi Lynch
2/9/26

*/

package labs.example.physics;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Physics physics = new Physics(); 
//instantiate the physics class
        double velocity = physics.getVelocity(100, 5);
        double momentum = physics.getMomentum(10, velocity);
        double force = physics.getForce(10, 9.8);
        double work = physics.getWork(force, 20);
        double kineticEnergy = physics.getKineticEnergy(10, velocity);
        double potentialEnergy = physics.getPotentialEnergy(10, 9.8, 15); 
// calling each method
        System.out.println("Velocity: " + velocity + " m/s");
        System.out.println("Momentum: " + momentum + " kg·m/s");
        System.out.println("Force: " + force + " N");
        System.out.println("Work: " + work + " J");
        System.out.println("Kinetic Energy: " + kineticEnergy + " J");
        System.out.println("Potential Energy: " + potentialEnergy + " J");
//print return value from the Main Class with the proper units 
    }
}