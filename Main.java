package Last.Command;

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        Driver d = new Driver(new Cdrive(c), new Cfollow(c), new Cstop(c));

            d.drive_car();
            d.follow_car();
            d.stop_car();
            }
}
