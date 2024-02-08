package week5Lab;

public class Start {
    public static void main(String[] args){
        TrainCar car1 = new TrainCar(TrainCarType.DRYSTORAGE);
        TrainCar car2 = new TrainCar(TrainCarType.LIQUIDSTORAGE);
        car1.setTrainCar(car2);
        TrainCar car3 = new TrainCar(TrainCarType.FROZENSTORAGE);
        car2.setTrainCar(car3);

        TrainCar shuttle = new TrainCar(null);
        shuttle.setTrainCar(car1);

        loop(shuttle);


    }
    public static void loop(TrainCar currentCar){
        
        
        while (currentCar.getTrainCar() != null){
            System.out.println(currentCar.getTrainCar().getType().getWeight());
            loop(currentCar.getTrainCar());
            break;
        }
    }
        
        
        
    
}
