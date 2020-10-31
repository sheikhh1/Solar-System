public class Planets extends Sun{
    
    private double planetVelocity;
    private double planetAngle;

    public Planets(int planetDistance ,double planetAngle, int planetDiameter, String planetColor, double planetVelocity) {
        super(planetColor, planetDistance, planetDiameter,planetAngle); // All angles start at 0 degrees from the sun
        this.planetVelocity = planetVelocity;
        this.planetAngle = planetAngle;   
    }

    public double getVelocity() {return planetVelocity;}

    public void move() {
        setAngle(getAngle()+getVelocity());
    }
}
