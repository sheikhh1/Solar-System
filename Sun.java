public class Sun extends SolarObjects{
    
    public int sunAngle;
    public int sunDiameter;
    public int sunDistance;
    public String sunColor;
    public Sun(int sunDistance ,int sunDiameter, int sunAngle){
        super("SUN", "YELLOW", sunDistance, sunDiameter,sunAngle); 
        sunColor = "YELLOW";
    }

    public int getDistance(){ return sunDistance;}

    public int getDiameter(){return sunDiameter;}

    public int getAngle(){return sunAngle;}

    public String getColor() {return sunColor;}
}