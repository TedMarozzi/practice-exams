package Lannisters;

public class Servant extends SlavePerson {

    private WesterosPerson master;

    public Servant(int age, String name) {
        super(age, name);
    }

    public void serve(WesterosPerson person)
    {
        master = person;
    }
}
