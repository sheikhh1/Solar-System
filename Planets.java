/**
 * Planet Class which inherits all the methods, variables from the Sun Class
 * @author Haaris Sheikh
 */
public class Planets extends Sun{
    
    private double planetVelocity; // Speed of the planet
    private double planetAngle; // Angle from the sun of a planet

    public Planets(int planetDistance ,double planetAngle, int planetDiameter, String planetColor, double planetVelocity) {
        super(planetColor, planetDistance, planetDiameter,planetAngle); // All angles start at 0 degrees from the sun
        this.planetVelocity = planetVelocity;
        this.planetAngle = planetAngle;   
    }

    /**
     * Accessor method 
     * @return Returns the planet velocity 
     */
    public double getVelocity() {return planetVelocity;}

    /**
     * Method Overwritten - Move all planets using this for each planet
     * Angle + Planet Speed Constantly happening to update 
     */
    public void move() {
        setAngle(getAngle()+getVelocity());
    }
}
