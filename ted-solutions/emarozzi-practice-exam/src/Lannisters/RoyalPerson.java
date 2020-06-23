package Lannisters;

import java.util.ArrayList;
import java.util.List;

public class RoyalPerson extends WesterosPerson {

    private int wealth;
    private static final int MAX_CASTLES = 3;
    private int numCastles = 0;

    public Castle[] castles = new Castle[MAX_CASTLES];


    private List<Servant> servants = new ArrayList<>();


    public RoyalPerson(int age, String name) {
        super(age, name);

    }

    public void demandServant(Servant servant)
    {
        servant.serve(this);
        servants.add(servant);
    }

    public void aquireCastle(Castle castle)
    {
        castles[numCastles++] = castle;
    }


}
