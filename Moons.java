/**
 * Moon Class which extends Planets
 * @author Haaris Sheikh
 */
public class Moons extends Planets {

    private double moonCentreOfRotationAngle;
    private int moonCentreOfRotationDistance;
    private  double planetSpeed; // Needed since the moon is keeping up with the planet that it's orbiting 
    
    /**
     * Moon Constructor 
     * @param moonDistance - Distance From the planet it is orbiting 
     * @param moonAngle - Angle of the moon from the sun
     * @param moonDiameter - Diameter of the moon
     * @param moonColor - Color of the moon
     * @param moonCentreOfRotationDistance - Adds a small amount of distance so the moon isnt inside the planet
     * @param moonCentreOfRotationAngle - CentreOfRotationAngle - The angle around the planet the moon is orbiting 
     * @param moonSpeed - Speed of moon (Orbit speed of the planet)
     * @param planetSpeed - Planet Speed the moon is orbiting - Needed for angle update
     */
    public Moons(int moonDistance, double moonAngle, int moonDiameter, String moonColor, int moonCentreOfRotationDistance, double moonCentreOfRotationAngle, double moonSpeed, double planetSpeed){
        super(moonDistance,moonAngle,moonDiameter,moonColor,moonSpeed); // Constructor of Planet Class
        this.moonCentreOfRotationAngle = moonCentreOfRotationAngle;
        this.moonCentreOfRotationDistance  = moonCentreOfRotationDistance;
        this.planetSpeed = planetSpeed;
    }

    /**
     * Accessor Method to getCentreOfRotationAngle
     * @return - CentreOfRotationAngle is returned
     */
    public double getCentreOfRotationAngle(){return moonCentreOfRotationAngle;}

    /**
     * Accessor Method 
     * @return Centre Of Rotation Distance 
     */
    public int getCentreOfRotationDistance(){return moonCentreOfRotationDistance;}

    /**
     * Mutator method to set the centreOfRotation angle which is always being updated as it spins
     */
    public void setCentreOfRotationAngle(double i){moonCentreOfRotationAngle = i;}

    /**
     * Move method which is overwritten
     * The angle is constantly being upadted to keep up with the planet it is orbiting 
     * Center of rotation angle is also updated so it spins around the planet at its own velocity 
     */
    public void move() {
        setAngle(getAngle() + planetSpeed);
        setCentreOfRotationAngle(getCentreOfRotationAngle() +getVelocity());
    }
}