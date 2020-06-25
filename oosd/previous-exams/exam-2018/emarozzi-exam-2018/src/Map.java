import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Map {
    ArrayList<Location> locations =  new ArrayList<>();


    public void addLoc(Location loc)
    {
        locations.add(loc);
    }


    public void sortLoc()
    {
        Collections.sort(locations);

    }

}
