package Fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan1 = new Fan(true,2,10,"green");
        fan1.getInfo();
        Fan fan2 = new Fan();
        fan2.getInfo();
    }
}
