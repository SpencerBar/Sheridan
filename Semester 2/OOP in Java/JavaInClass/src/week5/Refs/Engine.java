package Refs;

public class Engine {
    private int numCylinders;

    public Engine(int numCylinders) {
        this.numCylinders = numCylinders;
    }
    public Engine() {
        this.numCylinders = 6;
    }

    public int getNumCylinders()
    {
        return numCylinders;
    }

    public void start()
    {
        System.out.println("VVVRRRROOOOOMMMM");
    }

}
