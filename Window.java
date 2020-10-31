import java.util.Random;

/**
 * This class has been created to add all the objects on the screen
 * Polymorphism is used to add Planets / Moon / Asteroids which is then added into a SolarObjects Array
 * A while (true) loop is used to create the animation on the screen
 */
public class Window {
    private SolarObjects[] spaceObjects = new SolarObjects[250]; 
    // Instance created of SolarSystem to create a window and to use all the draw methods in this class 
    private SolarSystem space = new SolarSystem(1100,1100);
    // Random
    private Random rand = new Random();
    // Arrays created storing the specs for each planet. 
    private int [] planetDistance = new int[] {65,120,180,240,320,390,450, 510};
    private int [] planetDiameter = new int[] {10,15,15,20,25,20,18,17};
    private String[] planetColors = new String[] {"DARK_GRAY", "WHITE", "#3644E4", "RED", "ORANGE", "#AB604A", "#ACE5EE","#4B70DD"};
    private double[] planetSpeeds = new double[] {-6.3, -4.4, -3.7, -3.1, -1.6, -1.1, -0.8, -0.5};

    /**
     *  Window.java Constructor - When called the following methods are called
    */ 
    public Window() {
        // Sun is added to the SolarObjects Array
        addSun();
        // Planets is added to the SolarObjects Array
        addPlanets();
        // Moons is added to the SolarObjects Array
        addMoons();
        // Asteroids is added to the SolarObjects Array
        addAsteroids();
        // Run method draws everything to the window and moves all objects
        run();
    }

    /**
     * Add Sun to Array
     */
    public void addSun() {
        spaceObjects[0] = new Sun("YELLOW", 0,50,0);
    }

    /**
     * Add Planets to Array
     */
    public void addPlanets() {
        for (int i = 1; i < 9; i++) {
            spaceObjects[i] = new Planets(planetDistance[i-1],0,planetDiameter[i-1],planetColors[i-1], planetSpeeds[i-1]);
        }
    }

    /**
     * Add Moons to Array
     */
    public void addMoons(){
        int x =0;
        spaceObjects[9] = new Moons(180,0,5, "LIGHT_GRAY", 20,0,-6,planetSpeeds[2]); // Earth Moon
        spaceObjects[10] = new Moons(240,0,7, "LIGHT_GRAY", 20,0,-6,planetSpeeds[3]); // Mars Moon 1 (Phobos) - Slightly Bigger than Deimos
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

    /**
     * Add Asteroids to the array
     * Speed is randomised between 1 and 10
     * If iteration is on a odd number, speed = speed * -1 to make it orbit the other direction
     * Distance is randomised
     */
    public void addAsteroids(){
        int asteroidSpeed = (int) ((Math.random() * (10 - 1)) + 1);
        for (int i = 97; i < 250; i++) {
            if (i % 2 > 0) asteroidSpeed *= -1;
            int asteroidAngle = rand.nextInt(360);
            int asteroidDistance = (int) ((Math.random() * (278 - 273)) + 274);
            spaceObjects[i] = new Asteroids(asteroidDistance,asteroidAngle,5,"LIGHT_GRAY",asteroidSpeed);
        }
    }

    /**
     * Run Method
     * Contains a infinite loop which adds all the planets to the window
     * Runs Move method which changes the angle 
     * Update method to create animation 
     */
    public void run(){
        while (true) {
            // Draw Sun
            space.drawSolarObject(spaceObjects[0].getDistance(), spaceObjects[0].getAngle(), spaceObjects[0].getDiameter(), spaceObjects[0].getColor()); // Add SUN

            // Draw Planets
        for (int i = 1; i < 9; i++){
            space.drawSolarObject(spaceObjects[i].getDistance(),spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor());
        }
            // Draw Moons
        for (int i = 9; i < 97; i++){
            space.drawSolarObjectAbout(spaceObjects[i].getDistance(), spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor(), ((Moons)spaceObjects[i]).getCentreOfRotationDistance(), ((Moons)spaceObjects[i]).getCentreOfRotationAngle());
        }
            // Draw Asteroids
        for (int i = 97; i < 250; i++) {
            space.drawSolarObject(spaceObjects[i].getDistance(), spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor());
        }
          
        // Update Method - Creates pauses for animation effect
        space.finishedDrawing();

        // Calls the move() method for the corresponding Solar Objects - Method Override
        for (int i = 1; i < spaceObjects.length; i++) {
            spaceObjects[i].move();
        } 
        }
    }
}
