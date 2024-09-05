package interfaces;

public class Start {
    public static void main(String[] args)
    {
        
        Vehicle vehicle1 = new Vehicle();
        vehicle1.start();
        vehicle1.drive();
        vehicle1.stop();
        vehicle1.adjustTemperature();
        vehicle1.decreaseSpeed();
        vehicle1.increaseSpeed();
        vehicle1.playAudio();
        Car car1 = new Car();
        car1.start();
        car1.drive();
        car1.stop();
        car1.adjustTemperature();
        car1.decreaseSpeed();
        car1.increaseSpeed();
        car1.playAudio();
        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.start();
        motorcycle1.drive();
        motorcycle1.stop();
        motorcycle1.adjustTemperature();
        motorcycle1.decreaseSpeed();
        motorcycle1.increaseSpeed();
        motorcycle1.playAudio();

    }
}
