public class Driver {

    public static void main(String[] args){
        Sensor sensor = new RadioSensor(121234);
        System.out.println(sensor.toString());
    }
}
