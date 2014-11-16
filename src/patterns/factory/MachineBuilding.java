package patterns.factory;

/**
 * Created by Danuts on 11/16/2014.
 */
public abstract class MachineBuilding {

    protected abstract Machine makeMachine(String typeOfShip);

    public Machine orderTheMachine(String typeOfMachine) {

        Machine theEnemyShip = makeMachine(typeOfMachine);

        theEnemyShip.makeMachine();
        //theEnemyShip.displayMachine();
        //theEnemyShip.shootMachine();

        return theEnemyShip;
    }
}
