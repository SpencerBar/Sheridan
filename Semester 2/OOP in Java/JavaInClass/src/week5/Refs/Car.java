package Refs;

public class Car {

    private String make;

    //  Adding an Engine and Horn instance variables
     private Engine engine = new Engine(4);
     private Horn horn = new Horn();
   

    // Add a Constructor
    Car(Engine engine, Horn horn, String make){
        this.engine = engine;
        this.horn = horn;
        this.make = make;
    }
    //overloaded car constructor with only make provided
    Car(String make){
        this.engine = new Engine();
        this.horn = new Horn();
        this.make = make;
    }
    Car(){
        this.engine = new Engine();
        this.horn = new Horn();
        this.make = "Custom";
    }
    // Getter method for engine
    public int getEngineCly() {
        return engine.getNumCylinders();
    }
    
    // Getter method for horn
    public Horn getHorn() {
        return horn;
    }
// calls the reference object methods
    public void honkTheHorn(){
        horn.honk();
    }
    public void startTheEngine(){
        engine.start();
    }
    public String getMake(){
        return make;
    }

    
}
