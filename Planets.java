public class Planets extends Sun{
    
    public double planetVelocity;
    public int planetCentreRotationDistance;
    public int planetAngle;

    public Planets(int planetDistance, int planetCentreRotationDistance, int planetAngle, int planetDiameter, String planetColor, double planetVelocity) {
        super(planetColor, planetDistance, planetDiameter,planetAngle); // All angles start at 0 degrees from the sun
        this.planetVelocity = planetVelocity;
        this.planetCentreRotationDistance = planetCentreRotationDistance;
        this.planetAngle = planetAngle;
        
    }

    public double getVelocity() {return planetVelocity;}

    //public int getCentreRotationAngle() {return planetCentreRotationAngle;}

    

    public int getCentreRotationDistance() {return planetCentreRotationDistance;}

    public void move() {
        setAngle(getAngle()+getVelocity());
    }
}
