package SelfDrivingCar;

public abstract class Sensor {

    private final String id;
    private double measurement = 0.00;


    public Sensor(String id)
    {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double measure()
    {
        return measurement;
    }

}
