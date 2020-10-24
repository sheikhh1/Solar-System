public class SolarObjects {
    
    // Instance Variables 
    public String objectType;
    public String color;
    public int distance;
    public int diameter;
    public double angle;

    public SolarObjects(String color, int distance, int diameter, double angle) {
        this.color = color;
        this.distance = distance;
        this.diameter = diameter;
        this.angle = angle;
    }

    public String getObjectType() {return objectType;}

    public int getDistance() {return distance;}

    public void setDistance(int i) {distance = i;}

    public String getColor() {return color;}

    public double getAngle(){return angle;}

    public void setAngle(double i){angle = i;}

    public int getDiameter() {return diameter;}

    public void move(){};

 

    




}
