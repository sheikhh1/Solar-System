public class Driver {

    SolarObjects[] spaceObjects = new SolarObjects[100];
    SolarSystem space = new SolarSystem(1000,1000);

    public static void main(String[] args) {
        // Create an instance of Solar System to create a window 
        
        // int angleEarth = 0;
        // int angleMoon = 0;
        
        // while (true) {
        // // Draw Sun in the middle of the "Space" window 
        // space.drawSolarObject(0, 0, 90, "YELLOW");
        // // Draw Earth in orbit from the Sun 
        // space.drawSolarObject(120, angleEarth++, 40, "BLUE");
        // // Draw Moon in orbit of the Earth
        // space.drawSolarObjectAbout(120,angleEarth, 20, "WHITE", 40, angleMoon+=5);
        // // Update the "Space" window
        // space.finishedDrawing();
        // }
        
    }

    void addSun() {
        spaceObjects[0] = new Sun(0,100,0);
    }
    

    void addToWindow(){
        // Will add all the Planets / Sun / Moons to the window
    }
}
