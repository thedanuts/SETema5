package patterns.factory;

/**
 * Created by Danuts on 11/16/2014.
 */
public abstract class Machine {

    // Members
    private String name;
    Weapon weapon;
    Engine engine;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    /**
     * abstract method of the class
     */

    abstract void makeMachine();

    /**
     * @return string containing specifications of the current machine
     */

    public String toString() {

        String infoOnShip = "The " + name + " has a top speed of "
                + engine + " and can hit a target from " + weapon;

        return infoOnShip;
    }
}
