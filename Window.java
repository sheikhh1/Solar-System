public class Window {
    SolarObjects[] spaceObjects = new SolarObjects[12];
    SolarSystem space = new SolarSystem(1100,1100);

    public Window() {
        addSun();
        addPlanets();
        addMoons();
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
        spaceObjects[5] = new Planets(310,0,30,"ORANGE",-1.8); // Jupiter
        spaceObjects[6] = new Planets(390,0,20,"#AB604A", -1.35); // Saturn
        spaceObjects[7] = new Planets(450,0,18,"#ACE5EE",-1); // Uranus 
        spaceObjects[8] = new Planets(510,0,17,"#4B70DD",-0.8); // Neptune
    }

    public void addMoons(){
        spaceObjects[9] = new Moons(180,0,10, "LIGHT_GRAY", 20,0,-6,-4.1); // Earth Moon
        spaceObjects[10] = new Moons(240,0,12, "LIGHT_GRAY", 20,0,-6,-3.4); // Mars Moon 1 (Phobos)
        spaceObjects[11] = new Moons(240,0,10, "LIGHT_GRAY", 20,200,-6,-3.4); // Mars Moon 2 (Deimos)
    }

    public void run(){
        while (true) {
            space.drawSolarObject(spaceObjects[0].getDistance(), spaceObjects[0].getAngle(), spaceObjects[0].getDiameter(), spaceObjects[0].getColor()); // Add SUN

            for (int i = 1; i < 9; i++){

                space.drawSolarObject(spaceObjects[i].getDistance(),spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor());
        }

        for (int i = 9; i < spaceObjects.length; i++){
            space.drawSolarObjectAbout(spaceObjects[i].getDistance(), spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor(), ((Moons)spaceObjects[i]).getCentreOfRotationDistance(), ((Moons)spaceObjects[i]).getCentreOfRotationAngle());
        

        }
          
        space.finishedDrawing();

        for (int i = 1; i < spaceObjects.length; i++) {
            spaceObjects[i].move();
        }

        

            
        }
    }
}
