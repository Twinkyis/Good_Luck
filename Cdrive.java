package Last.Command;

public class Cdrive implements Car_delivery{

    Car car;

     public Cdrive(Car car) {
        this.car = car;
    }
        public void delivery(){
            car.drive();}
}
