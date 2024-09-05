package week5Lab;

public class TrainCar {
    private TrainCarType type;
    private TrainCar nextTrainCar = null;

    TrainCar(){}
    
    TrainCar(TrainCarType type){
        this.type = type;
    }
    public void setTrainCar(TrainCar nextTrainCar){
        this.nextTrainCar = nextTrainCar;
    }
    public TrainCar getTrainCar(){
        return nextTrainCar;
    }
    public TrainCarType getType(){
        return type;
    }

    
}
