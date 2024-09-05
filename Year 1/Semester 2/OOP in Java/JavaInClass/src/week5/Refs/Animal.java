package Refs;

import Enums.AnimalTypes;

public class Animal {
    private AnimalTypes animalType;
    public Animal(AnimalTypes animalType){
        this.animalType = animalType;
}
public AnimalTypes getType(){
    return animalType;
}
    
}
