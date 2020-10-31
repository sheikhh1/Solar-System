import java.util.Random;

public class Window {
    private SolarObjects[] spaceObjects = new SolarObjects[250];
    private SolarSystem space = new SolarSystem(1100,1100);
    private Random rand = new Random();
    private int [] planetDistance = new int[] {65,120,180,240,320,390,450, 510};
    private int [] planetDiameter = new int[] {10,15,15,20,25,20,18,17};
    private String[] planetColors = new String[] {"DARK_GRAY", "WHITE", "#3644E4", "RED", "ORANGE", "#AB604A", "#ACE5EE","#4B70DD"};
    private double[] planetSpeeds = new double[] {-6.3, -4.4, -3.7, -3.1, -1.6, -1.1, -0.8, -0.5};

    public Window() {
        addSun();
        addPlanets();
        addMoons();
        addAsteroids();
        run();
    }
    public void addSun() {
        spaceObjects[0] = new Sun("YELLOW", 0,50,0);
    }

    public void addPlanets() {

        for (int i = 1; i < 9; i++) {
            spaceObjects[i] = new Planets(planetDistance[i-1],0,planetDiameter[i-1],planetColors[i-1], planetSpeeds[i-1]);
        }
    }

    public void addMoons(){
        int x =0;
        spaceObjects[9] = new Moons(180,0,5, "LIGHT_GRAY", 20,0,-6,planetSpeeds[2]); // Earth Moon
        spaceObjects[10] = new Moons(240,0,7, "LIGHT_GRAY", 20,0,-6,planetSpeeds[3]); // Mars Moon 1 (Phobos)
        spaceObjects[11] = new Moons(240,0,5, "LIGHT_GRAY", 20,200,-6,planetSpeeds[3]); // Mars Moon 2 (Deimos)

        //Jupiters Galilean Moons
        for (int i = 12; i < 15; i++) {
            spaceObjects[i] = new Moons(320,0,5,"LIGHT_GRAY", 25,x+=120,-6,planetSpeeds[4]);
        }

        // Saturn Ring - 82 Moons
        for (int i = 15; i < 97; i++) {
            int y = rand.nextInt(360) + 1;
            spaceObjects[i] = new Moons(390,0,5,"LIGHT_GRAY", 25,y,-6,planetSpeeds[5]);
        }
    }

    public void addAsteroids(){
        int asteroidSpeed = (int) ((Math.random() * (10 - 1)) + 1);
        for (int i = 97; i < 250; i++) {
            if (i % 2 > 0) asteroidSpeed *= -1;
            int asteroidAngle = rand.nextInt(360);
            int asteroidDistance = (int) ((Math.random() * (278 - 273)) + 274);
            spaceObjects[i] = new Asteroids(asteroidDistance,asteroidAngle,5,"LIGHT_GRAY",asteroidSpeed);
        }
    }

    public void run(){
        while (true) {
            space.drawSolarObject(spaceObjects[0].getDistance(), spaceObjects[0].getAngle(), spaceObjects[0].getDiameter(), spaceObjects[0].getColor()); // Add SUN

        for (int i = 1; i < 9; i++){
            space.drawSolarObject(spaceObjects[i].getDistance(),spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor());
        }

        for (int i = 9; i < 97; i++){
            space.drawSolarObjectAbout(spaceObjects[i].getDistance(), spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor(), ((Moons)spaceObjects[i]).getCentreOfRotationDistance(), ((Moons)spaceObjects[i]).getCentreOfRotationAngle());
        }

        for (int i = 97; i < 250; i++) {
            space.drawSolarObject(spaceObjects[i].getDistance(), spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor());
        }
          
        space.finishedDrawing();

        for (int i = 1; i < spaceObjects.length; i++) {
            spaceObjects[i].move();
        } 
        }
    }
}
