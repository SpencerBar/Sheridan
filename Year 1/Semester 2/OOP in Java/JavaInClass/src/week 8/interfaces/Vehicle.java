package interfaces;

public class Vehicle extends VehicleAbstract{
    Vehicle(){};
    public void start(){
        System.out.println("vroom");
    }
    public void drive(){
        System.out.println("skrrrt");
    }
    public void stop(){
        System.out.println("rrrrrt");
    }
    public void increaseSpeed(){System.out.println("faster");};
    public void decreaseSpeed(){System.out.println("slower");};
    public void adjustTemperature(){System.out.println("temperature control activated");}
    
    
}
