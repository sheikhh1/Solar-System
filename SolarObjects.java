/**
 * SolarObjects class (SuperClass)
 * All Objects (Planets,Moons,Asteroids,Sun) inherit this class
 */
public class SolarObjects {
    
    // Instance Variables that all objects have 
    public String color;
    public int distance;
    public int diameter;
    public double angle;

    /**
     * Constructor 
     * @param color - Color of an object
     * @param distance - Distance from the sun 
     * @param diameter - Diameter of the object 
     * @param angle - Angle around the sun 
     */
    public SolarObjects(String color, int distance, int diameter, double angle) {
        this.color = color;
        this.distance = distance;
        this.diameter = diameter;
        this.angle = angle;
    }

    /**
     * This accessor method returns the distance of an object from the sun
     * @return Distance is returned 
     */
    public int getDistance() {return distance;}

    /**
     * This accessor method returns the color of an object
     * @return Color is returned 
     */
    public String getColor() {return color;}

    /**
     * Accessor method to return the current angle of an object
     * @return Angle is returned
     */
    public double getAngle(){return angle;}

    /**
     * Mutator method to set an angle
     * Used when moving planets around the sun as their angle is being changed by adding their corresponding speed
     * @param i (Angle + Speed) = New Angle
     */
    public void setAngle(double i){angle = i;}

    /**
     * Accessor method to get the diameter of an object
     * @return Diameter is returned 
     */
    public int getDiameter() {return diameter;}

    /**
     * Move method
     * This method is available for all the subclasses of SolarObjects Class
     * Method override occurs on this method on the classes that need this method
     * Will be responsible of changing the angles / centre of rotation angle etc
     */
    public void move(){};

 

    




}
