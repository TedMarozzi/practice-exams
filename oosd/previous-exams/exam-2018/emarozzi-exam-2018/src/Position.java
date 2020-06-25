public final class Position implements Comparable<Position> {
    private double x, y;
    public Position(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    double distanceTo(Position pos)
    {
        return Math.sqrt(Math.pow(this.x - pos.getX(), 2) + Math.pow(this.y - pos.getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ")";
    }


    @Override
    public int compareTo(Position pos) {
        Position origin = new Position(0.00, 0.00);
        return (int) this.distanceTo(origin)) - (pos.distanceTo(origin);

    }
}
