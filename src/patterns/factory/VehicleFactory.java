package patterns.factory;

/**
 * Created by Danuts on 11/16/2014.
 */
public class VehicleFactory implements MachineFactory {

    @Override
    public Engine addEngine() {
        return null;
    }

    @Override
    public Weapon addWeapon() {
        return null;
    }
}
