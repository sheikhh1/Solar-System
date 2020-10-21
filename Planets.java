public class Planets extends Sun{
    
    public int planetVelocity;
    public int planetCentreRotationDistance;
    public int planetCentreRotationAngle;

    public Planets(int planetDistance, int planetCentreRotationDistance, int planetAngle, int planetCentreRotationAngle, int planetDiameter, String planetColor, int planetVelocity) {
        super(planetColor, planetDistance, planetDiameter, planetAngle);
        this.planetVelocity = planetVelocity;
        this.planetCentreRotationDistance = planetCentreRotationDistance;
        this.planetCentreRotationAngle = planetCentreRotationAngle;
        
    }

    public int getVelocity() {return planetVelocity;}

    public int getCentreRotationAngle() {return planetCentreRotationAngle;}

    public int getCentreRotationDistance() {return planetCentreRotationDistance;}
}
