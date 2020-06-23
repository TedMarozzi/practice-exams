package Lannisters;

public abstract class SlavePerson extends RoyalPerson {

    private static double cost;
    private static boolean isPassive = true;

    protected SlavePerson(int age, String name) {
        super(age, name);
    }

}
