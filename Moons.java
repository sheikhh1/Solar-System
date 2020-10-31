public class Moons extends Planets {

    private double moonCentreOfRotationAngle;
    private int moonCentreOfRotationDistance;
    private  double planetSpeed;
    
    public Moons(int moonDistance, double moonAngle, int moonDiameter, String moonColor, int moonCentreOfRotationDistance, double moonCentreOfRotationAngle, double moonSpeed, double planetSpeed){
        super(moonDistance,moonAngle,moonDiameter,moonColor,moonSpeed);
        this.moonCentreOfRotationAngle = moonCentreOfRotationAngle;
        this.moonCentreOfRotationDistance  = moonCentreOfRotationDistance;
        this.planetSpeed = planetSpeed;
    }

    public double getCentreOfRotationAngle(){return moonCentreOfRotationAngle;}

    public int getCentreOfRotationDistance(){return moonCentreOfRotationDistance;}

    public void setCentreOfRotationAngle(double i){moonCentreOfRotationAngle = i;}

    public void move() {
        setAngle(getAngle() + planetSpeed);
        setCentreOfRotationAngle(getCentreOfRotationAngle() +getVelocity());
    }
}