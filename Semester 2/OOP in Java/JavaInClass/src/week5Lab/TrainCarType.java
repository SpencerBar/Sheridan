package week5Lab;

public enum TrainCarType {
    LIQUIDSTORAGE(2000),DRYSTORAGE(1500),FROZENSTORAGE(2500);

    private int weight;

    TrainCarType(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }
}
