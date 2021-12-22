package Last.Command;

public class Cfollow implements Car_delivery{
    Car car;

    public Cfollow(Car car) {
        this.car = car;
    }
    public void delivery(){
        car.follow();}
}
