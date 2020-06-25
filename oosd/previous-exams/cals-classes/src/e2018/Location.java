package e2018;

public class Location implements Comparable<Location>{
    private Position position;
    private LocationType locationType;
    
    public Location(Position position, LocationType locationType){
        this.position = position;
        this.locationType = locationType;
    }

    public double distanceTo(Location location){
        return position.distanceTo(location.position);
    }

    @Override
    public String toString() {
        return locationType.getType().toUpperCase() +
                "at " + position.toString();
    }

    @Override
    public int compareTo(Location location) {
        return position.compareTo(location.position);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public Position getPosition() {
        return position;
    }
}
