public class Sun extends SolarObjects{
    public String sunColor = "YELLOW";
    public int angle;

    public Sun(String sunColor,int sunDistance ,int sunDiameter, int sunAngle){
        super("SUN", sunColor, sunDistance, sunDiameter,sunAngle);
        
    }
}