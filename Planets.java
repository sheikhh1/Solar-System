public class Planets extends SolarObjects{
    
    public int planetVelocity;
    public int planetDistance;
    public int planetRotationAngle;
    public int planetDiameter;
    public String planetColor;

    public Planets(int planetDistance, int planetRotationAngle, int planetDiameter, String planetColor, int planetVelocity) {
        super("PLANET", planetColor, planetDistance, planetDiameter, planetRotationAngle);
        this.planetVelocity = planetVelocity;
        this.planetDistance = planetDistance;
        this.planetRotationAngle = planetRotationAngle;
        this.planetDiameter = planetDiameter;
        this.planetColor = planetColor;
        

    }
}
