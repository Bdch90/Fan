package Fan;

public class Fan{
    //KHong biet de lam gi
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    
    private int speed = 1;
    private boolean onOrOff = false;
    private int radius = 5;
    private String color = "blue";
    public Fan() { }
    public Fan (boolean onOrOff, int speed, int radius, String color)
    {
        this.onOrOff = onOrOff;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }
    public void getInfo()
    {
        if ( onOrOff )
        {
            System.out.println("Status : On " + "\nSpeed " + this.speed +"\nRadius "+ this.radius + "\nColor " + this.color );
        }
        else
        {
            System.out.println("Status : off " +"\nRadius "+ this.radius + "\nColor + " + this.color);
        }
    }
    public int setSpeed (int speed)
    {
        return this.speed = speed;
    }
    public int setRadius (int radius)
    {
        return this.radius = radius;
    }
    public String setColor (String color)
    {
        return this.color = color;
    }
}
