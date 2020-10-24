public class Moons extends Planets {

    public double moonCentreOfRotationAngle;
    public int moonCentreOfRotationDistance;
    public double planetSpeed;
    public Moons(int moonDistance, double moonAngle, int moonDiameter, String moonColor, int moonCentreOfRotationDistance, double moonCentreOfRotationAngle, double moonSpeed, double planetSpeed){
        super(moonDistance,moonAngle,moonDiameter,moonColor,moonSpeed);
        this.moonCentreOfRotationAngle = moonCentreOfRotationAngle;
        this.moonCentreOfRotationDistance  = moonCentreOfRotationDistance;
        this.planetSpeed = planetSpeed;
        //setDistance(moonDistance);
    }

    public double getCentreOfRotationAngle(){return moonCentreOfRotationAngle;}

    public int getCentreOfRotationDistance(){return moonCentreOfRotationDistance;}

    public void setCentreOfRotationAngle(double i){moonCentreOfRotationAngle = i;}

    public void move() {
        setAngle(getAngle() + planetSpeed);
        setCentreOfRotationAngle(getCentreOfRotationAngle() +getVelocity());
    }
}