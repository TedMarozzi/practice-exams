package e2018;

import java.util.List;
import java.util.stream.Collectors;

public class Map {
    List<Location> locationList;

    public void addLocation(Location location){
        locationList.add(location);
    }

    public void sortLocations(){
        locationList = locationList.stream().sorted(Location::compareTo).collect(Collectors.toList());
    }
}
