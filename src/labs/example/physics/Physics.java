/* 
Levi Lynch
2/9/26

*/

package labs.example.physics;
import java.lang.Math;

public class Physics {

    final static double GRAVITY = 9.81;
    
    public double getDistance(double velocity, double time) {
        double miles = velocity * time;
        return miles;
    }

    
    public double getVelocity(double time, double mph){

        double velocity = mph/time;
        return velocity;
    }

    public double getMomentum(double mass, double velocity){

        double power = mass * velocity;
        return power;
    }

    public double getForce(double mass, double acceleration){

        double force = mass * acceleration;
        return force;
    }

    public double getWork( double force, double duration){

        double work = force * duration;
        return work;

    }

    public double getKineticEnergy(double mass, double volume){

        double kineticEnergy = 0.5 * mass * volume * volume;
        return kineticEnergy;

    }

    public double getPotentialEnergy(double mass, double gravity, double height){
        double potentialEnergy = mass * gravity * height;
        return potentialEnergy;
    }

   public void logInvalidAngleInfo(double angleDeg) {
        System.out.println("Logging the angle... " + angleDeg 
                + " degrees. This is not a right angle.");}

    public void logValidAngleInfo(double angleDeg) {
        System.out.println("Logging the angle... " + angleDeg 
                + " degrees. This is a valid 3-4-5 triangle.");
    }

    public double getAngle() {

        double angleRadians;
        double angleDeg;

        angleRadians = Math.atan2(3, 4);
        angleDeg = (angleRadians * 180) / 3.1415;

        return angleDeg;

}
}
