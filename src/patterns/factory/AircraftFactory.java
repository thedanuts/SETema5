package patterns.factory;

/**
 * Created by Danuts on 11/16/2014.
 */
public class AircraftFactory implements MachineFactory {

    @Override
    public Engine addEngine() {
        return new AircraftEngine();
    }

    @Override
    public Weapon addWeapon() {
        return new AircraftWeapon();
    }
}
