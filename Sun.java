/**
 * Sun Class used to store all the information for a sun
 * @author Haaris Sheikh
 */
public class Sun extends SolarObjects{
    
    /**
     * Sun Class which extends SolarObjects
     * @param sunColor - Color of the sun
     * @param sunDistance - Distance of the sun
     * @param sunDiameter - Diameter of the sun
     * @param sunAngle - Angle of the sun
     */
    public Sun(String sunColor, int sunDistance ,int sunDiameter, double sunAngle){
        super(sunColor, sunDistance, sunDiameter,sunAngle); // Constructor of solar objects
        
    }
}