public class Location implements Comparable<Location> {
    private Position pos;
    private Locationtype locationtype;
    private Location(Position pos, LocationType locationType)
    {

        this.pos = pos;
        this.locationtype = locationType;


    }

    public Locationtype getLocationtype() {
        return locationtype;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void setLocationtype(Locationtype locationtype) {
        this.locationtype = locationtype;
    }

    public double distanceTo(Location location)
    {
        return this.pos.distanceTo(location.pos);
    }

    @Override
    public String toString() {
        return locationtype + " at (" + pos.getX() + ", " + pos.getY() + ")";
    }

    @Override
    public int compareTo(Location loc) {

        return (int)this.pos.compareTo(loc.getPos());
    }
}
