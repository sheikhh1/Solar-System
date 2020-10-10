public class Driver {
    public static void main(String[] args) {
        // Create an instance of Solar System to create a window 
        SolarSystem space = new SolarSystem(500,500);
        int angleEarth = 0;
        int angleMoon = 0;
        
        while (true) {
        // Draw Sun in the middle of the "Space" window 
        space.drawSolarObject(0, 0, 90, "YELLOW");
        // Draw Earth in orbit from the Sun 
        space.drawSolarObject(120, angleEarth++, 40, "BLUE");
        // Draw Moon in orbit of the Earth
        space.drawSolarObjectAbout(120,angleEarth, 20, "WHITE", 40, angleMoon+=5);
        // Update the "Space" window
        space.finishedDrawing();
        }
        
    }
}
