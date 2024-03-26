package interfaces;

public class Motorcycle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("motorcycle goes:");
        super.drive();
    }
}
