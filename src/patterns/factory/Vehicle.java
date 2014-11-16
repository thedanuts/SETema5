package patterns.factory;

/**
 * Created by Danuts on 11/16/2014.
 */
public class Vehicle extends Machine {

    MachineFactory aircraftFactory;

    public Vehicle(MachineFactory aircraftFactory) {
        this.aircraftFactory = aircraftFactory;
    }

    @Override
    void makeMachine() {
        // Specific abstract function implementation
        System.out.println("Making vehicle " + getName());

        weapon = aircraftFactory.addWeapon();
        engine = aircraftFactory.addEngine();
    }
}
