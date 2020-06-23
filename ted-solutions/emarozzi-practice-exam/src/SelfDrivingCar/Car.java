package SelfDrivingCar;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private boolean poweredOn = false;
    private List<Sensor> sensors = new ArrayList<>();
    private static final double dangerThreshold = 0.00;
    private static final double MINIMUM_SENSORS = 3;
    private static final double MAX_DANGER_SENSORS = 7;

    public Car()
    {

    }

    private int measureSensors()
    {
        int numHighDanger = 0;
        for(Sensor sensor: sensors)
        {
            System.out.println("Sensor [" + sensor.getId() + "]: " + sensor.measure());
            if(sensor.measure() > dangerThreshold)
            {
                numHighDanger++;
            }
        }
        System.out.println(numHighDanger + " sensors above threshold");

        return numHighDanger;
    }

    private boolean dangerImminent()
    {
        return sensors.size() <= MINIMUM_SENSORS || measureSensors() >= MAX_DANGER_SENSORS;
    }

    private void run()
    {
        if(!poweredOn && !dangerImminent())
        {
            poweredOn = true;
        }

        if(dangerImminent())
        {
            poweredOn = false;
        }

        operate();
    }


}
