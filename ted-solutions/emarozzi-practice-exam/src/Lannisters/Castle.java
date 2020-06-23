package Lannisters;

import java.util.ArrayList;
import java.util.List;

public class Castle {

    private static double value;
    private List<Guard> guards = new ArrayList<>();

    public Castle(double value)
    {
        this.value = value;
    }

    public void addGuard(Guard guard)
    {
        guards.add(guard);


    }
}
