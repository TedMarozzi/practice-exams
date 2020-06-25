package e2018;

public class Position implements Comparable<Position>{
    private static final Position ORIGIN = new Position(0,0);
    private final double x;
    private final double y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Position position){
        double xDist = position.x - this.x;
        double yDist = position.y - this.y;
        return Math.sqrt((xDist * xDist) + (yDist * yDist));
    }

    @Override
    public String toString() {
        return "(" + x + ',' + y +
                ')';
    }

    @Override
    public int compareTo(Position position) {
        double differenceInDist = this.distanceTo(ORIGIN) - position.distanceTo(ORIGIN);
        if (differenceInDist > 0){
            return 1;
        }
        else if (differenceInDist < 0){
            return -1;
        }
        else return 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
