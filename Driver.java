public class Driver {
    public static void main(String[] args) {
        // Main Function

        // Create an instance of the Solar System
        SolarSystem space = new SolarSystem(600,600);
        // Draw a Sun in the middle of the window
        space.drawSolarObject(50, 0, 100, "YELLOW");
    }
}
