/**
 * Asteroid Class which inherits from moons
 * @author Haaris Sheikh
 */
public class Asteroids extends Moons{
    /**
     * Constructor for asteroid class
     * @param asteroidDistance - Distance From the Sun
     * @param asteroidAngle - Angle from the sun (Different per asteroid)
     * @param asteroidDiameter - Angle diameter
     * @param asteroidColor - Color of the asteroid
     * @param asteroidSpeed - Speed of the asteroid (Randomised)
     */
    public Asteroids(int asteroidDistance, int asteroidAngle, int asteroidDiameter, String asteroidColor, int asteroidSpeed){
        super(asteroidDistance,asteroidAngle,asteroidDiameter,asteroidColor,0,0,asteroidSpeed,0); // Moon Constructor 
    }

    /**
     * Move method for asteroids
     * Distance From Sun + Velocity of asteroid 
     */
    public void move(){
        setAngle(getAngle() + getVelocity());
    }
}
