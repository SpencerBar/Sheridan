package interfaces;

public abstract class VehicleAbstract implements Drivable{
    public abstract void start();
    public abstract void increaseSpeed();
    public abstract void decreaseSpeed();
    public void playAudio(){
      System.out.println("dudududu");
    }
    public abstract void adjustTemperature();
    
}
