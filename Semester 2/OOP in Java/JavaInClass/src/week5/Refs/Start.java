package Refs;

import Enums.AnimalTypes;

public class Start {
    public static void main(String[] args)
    {

        // ⁡⁢⁣⁡⁣⁢⁢Part A:⁡⁡

        //Let's look at Horn and Engine

        //Let's Instantiate a Horn object and make it honk

        
        Horn horn = new Horn();
        horn.honk(); 

        //Let's instantiate an Engine object and start it.
        Engine engine = new Engine(4);
        engine.start();
        
        //Ok, Car's have Horns and Car's have Engines.  We could even say that a Car is 'composed' of many parts, including a Horn and an Engine.

        //We would like to design our Car class to be composed of a Horn and an Engine.  Let's go to the Car clas and add the code to do this

        //Now we can instantiate a Car:

       
        Car car = new Car(engine, horn, "civic");
        

        car.honkTheHorn();
        
    
        car.startTheEngine();
        

        Car car2 = new Car ( new Engine (4), new Horn(), "P)Orius");
        car2.honkTheHorn();


        //Circus

        Animal a3 = new Animal(AnimalTypes.LION);
        Cage c1 = new Cage();
        c1.setAnimal(a3);
        
    }
}