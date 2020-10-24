import java.util.Random;

public class Window {
    SolarObjects[] spaceObjects = new SolarObjects[250];
    SolarSystem space = new SolarSystem(1100,1100);
    Random rand = new Random();

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
        spaceObjects[1] = new Planets(65,0,10,"DARK_GRAY",-7); //Mecury
        spaceObjects[2] = new Planets(120,0,15,"WHITE",-4.9); // Venus
        spaceObjects[3] = new Planets(180,0,15,"#3644E4",-4.1); //Earth
        spaceObjects[4] = new Planets(240,0,20,"RED", -3.4); // Mars
        spaceObjects[5] = new Planets(320,0,25,"ORANGE",-1.8); // Jupiter
        spaceObjects[6] = new Planets(390,0,20,"#AB604A", -1.35); // Saturn
        spaceObjects[7] = new Planets(450,0,18,"#ACE5EE",-1); // Uranus 
        spaceObjects[8] = new Planets(510,0,17,"#4B70DD",-0.8); // Neptune
    }

    public void addMoons(){
        int x =0;
        spaceObjects[9] = new Moons(180,0,5, "LIGHT_GRAY", 20,0,-6,-4.1); // Earth Moon
        spaceObjects[10] = new Moons(240,0,7, "LIGHT_GRAY", 20,0,-6,-3.4); // Mars Moon 1 (Phobos)
        spaceObjects[11] = new Moons(240,0,5, "LIGHT_GRAY", 20,200,-6,-3.4); // Mars Moon 2 (Deimos)

        //Jupiters Galilean Moons
        for (int i = 12; i < 15; i++) {
            spaceObjects[i] = new Moons(320,0,5,"LIGHT_GRAY", 25,x+=120,-6,-1.8);
        }

        // Saturn Ring - 82 Moons
        for (int i = 15; i < 97; i++) {
            int y = rand.nextInt(360) + 1;
            spaceObjects[i] = new Moons(390,0,5,"LIGHT_GRAY", 25,y,-6,-1.35);
        }
    }

    public void addAsteroids(){
        for (int i = 97; i < 250; i++) {
            int asteroidAngle = rand.nextInt(360);
            int asteroidDistance = (int) ((Math.random() * (277 - 274)) + 274);
            spaceObjects[i] = new Asteroids(asteroidDistance,asteroidAngle,5,"LIGHT_GRAY",-6);
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
