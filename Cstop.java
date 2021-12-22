package Last.Command;

public class Cstop implements Car_delivery{
    Car car;

    public Cstop(Car car) {
        this.car = car;
    }
    public void delivery(){
        car.stop();}
}
