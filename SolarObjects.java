public class SolarObjects {
    
    // Instance Variables 
    public String objectType;
    public String color;
    public int distance;
    public int diameter;
    public int angle;

    public SolarObjects(String color, int distance, int diameter, int angle) {
        
        this.color = color;
        this.distance = distance;
        this.diameter = diameter;
        this.angle = angle;
    }

    public String getObjectType() {return objectType;}

    public int getDistance() {return distance;}

    public String getColor() {return color;}

    public int getAngle(){return angle;}

    public int getDiameter() {return diameter;}

    //public int getCentreRotationDistance();

 

    




}
