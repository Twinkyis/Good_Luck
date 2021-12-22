package Last.Command;

public class Driver {
    Car_delivery drive;
    Car_delivery follow;
    Car_delivery stop;

    public Driver(Car_delivery drive, Car_delivery follow, Car_delivery stop) {
        this.drive = drive;
        this.follow = follow;
        this.stop = stop;
    }
    void drive_car(){
        drive.delivery();
    }
    void follow_car(){
        follow.delivery();
    }
    void stop_car(){
        stop.delivery();
    }
}
