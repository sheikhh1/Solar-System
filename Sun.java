public class Sun extends SolarObjects{
    public String color;
    public int angle;

    public Sun(String color, int angle){
        super(0,100);
        this.color = color;
        this.angle = angle;
    }
}