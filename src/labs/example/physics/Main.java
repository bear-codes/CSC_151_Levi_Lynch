/* 
Levi Lynch
2/9/26


javac -d bin src/labs/example/physics/*.java  
java -cp bin labs.example.physics/Main
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



//Week 6 lab:
double angle = physics.getAngle();

        // Check if angle is outside valid range
        if (angle > 37 || angle < 36.87) {
            physics.logInvalidAngleInfo(angle);
        } else {
            physics.logValidAngleInfo(angle);
        }

        // Get velocity and time from Physics class
        
        double time = physics.getTimeFromSunToEarthInHours();

        // Call getDistance() using velocity and time
        double calculatedDistance = physics.getDistance(velocity, time);

        // Known correct distance
        double knownDistance = physics.getKnownDistanceToEarth();

        // Output values
        System.out.println("Velocity (mph): " + velocity);
        System.out.println("Time (hours): " + time);
        System.out.println("Calculated Distance (miles): " + calculatedDistance);
        System.out.println("Known Distance (miles): " + knownDistance);

        // Validate result
        if (Math.abs(calculatedDistance - knownDistance) < 0.01) {
            System.out.println("Distance calculation is VALID.");
        } else {
            physics.logEarthToSunInvalidDistance();
        }
    }
}


