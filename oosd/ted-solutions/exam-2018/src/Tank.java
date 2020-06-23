public class Tank extends Vehicle {
    private int fuel;
    private Player[] playersInside = new Player[4];

    Tank(double posX, double posY, Mesh mesh) {
        super(posX, posY, mesh);
    }


}
