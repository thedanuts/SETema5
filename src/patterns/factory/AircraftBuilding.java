package patterns.factory;

/**
 * Created by Danuts on 11/16/2014.
 */
public class AircraftBuilding extends MachineBuilding {

    /**
     * Method that produces specific objects according to the given parameter
     * @param machineType aircraft or vehicle
     * @return The concrete object instance or {@code null} if the parameter did not match
     */

    @Override
    protected Machine makeMachine(String machineType) {
        Machine machine = null;

        if (machineType.equals("Aircraft")) {
            MachineFactory machineFactory = new AircraftFactory();
            machine = new Aircraft(machineFactory);
            machine.setName("Lockheed Martin");
        } else if (machineType.equals("Vehicle")) {
            MachineFactory machineFactory = new VehicleFactory();
            machine = new Vehicle(machineFactory);
            machine.setName("Puma");
        } else {
            return null;
        }

        return machine;
    }
}
