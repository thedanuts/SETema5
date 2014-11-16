package patterns.factory;

/**
 * Created by Danuts on 11/16/2014.
 */
public class Aircraft extends Machine {

    MachineFactory aircraftFactory;

    /**
     * Generic constructor
     * @param aircraftFactory factory in which is produced
     */

    public Aircraft(MachineFactory aircraftFactory) {
        this.aircraftFactory = aircraftFactory;
    }

    @Override
    void makeMachine() {
        // Specific abstract function implementation
        System.out.println("Making aircraft " + getName());

        weapon = aircraftFactory.addWeapon();
        engine = aircraftFactory.addEngine();
    }
}
