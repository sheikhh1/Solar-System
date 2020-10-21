public class Window {
    SolarObjects[] spaceObjects = new SolarObjects[100];
    SolarSystem space = new SolarSystem(1100,1100);

    public Window() {
        addSun();
        addPlanets();
        addToWindow();
    }
    public void addSun() {
        spaceObjects[0] = new Sun("YELLOW", 0,50,0);
    }

    public void addPlanets() {
        spaceObjects[1] = new Planets(65,0,0,10,"DARK_GRAY",5); //Mecury
        spaceObjects[2] = new Planets(120,0,0,15,"WHITE",5); // Venus
        spaceObjects[3] = new Planets(180,0,0,15,"#3644E4",5); //Earth
        spaceObjects[4] = new Planets(240,0,0,20,"RED", 5); // Mars
        spaceObjects[5] = new Planets(310,0,0,30,"ORANGE",5); // Jupiter
        spaceObjects[6] = new Planets(390,0,0,20,"#AB604A", 5); // Saturn
        spaceObjects[7] = new Planets(450,0,0,18,"#ACE5EE",5); // Uranus 
        spaceObjects[8] = new Planets(510,0,0,17,"#4B70DD",5); // Neptune
    }
    

    public void addToWindow(){
        int i = 0;
        // Will add all the Planets / Sun / Moons to the window
        
            if (i == 0) {
                space.drawSolarObject(spaceObjects[i].getDistance(), spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor());
            } 

            for(i = 1; i < 9; i++){
                space.drawSolarObjectAbout(spaceObjects[i].getDistance(), spaceObjects[i].getAngle(), spaceObjects[i].getDiameter(), spaceObjects[i].getColor(), ((Planets)spaceObjects[i]).getCentreRotationDistance(), ((Planets)spaceObjects[i]).getCentreRotationDistance());

            }
            
            
        
    }
}
