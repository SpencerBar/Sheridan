package Enums;

    public enum AnimalTypes{
        ELEPHANT("large"),MONKEY("small"),BEAR("medium"),LION("medium"),TIGER("medium");

        String size;

        AnimalTypes(String size){
            this.size = size;
        }
    }
    