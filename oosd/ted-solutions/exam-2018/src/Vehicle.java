public class Vehicle extends GameAsset {

    private Mesh mesh;
    private static final MAX_SPEED = 100;
    private static boolean isActive = true;

    Vehicle(double posX, double posY, Mesh mesh) {
        super(posX, posY, mesh);
    }
}
