package interfaces;

public class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("car goes: ");
        super.drive();

    }
}
