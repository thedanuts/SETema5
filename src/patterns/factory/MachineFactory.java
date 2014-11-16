package patterns.factory;

/**
 * Created by Danuts on 11/16/2014.
 */
public interface MachineFactory {

    public Weapon addWeapon();
    public Engine addEngine();
}
