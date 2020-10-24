public class Asteroids extends Moons{

    public Asteroids(int asteroidDistance, int asteroidAngle, int asteroidDiameter, String asteroidColor, int asteroidSpeed){
        super(asteroidDistance,asteroidAngle,asteroidDiameter,asteroidColor,0,0,asteroidSpeed,0);
    }

    public void move(){
        setAngle(getAngle() + getVelocity());
    }
}
