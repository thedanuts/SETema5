package patterns.factory;

/**
 * Created by Danuts on 11/16/2014.
 */
public class Main {

    public static void main(String[] args) {

        MachineBuilding MakeMachines = new AircraftBuilding();

        //Produce objects

        Machine theRaptor = MakeMachines.orderTheMachine("Aircraft");
        System.out.println(theRaptor + "\n");

        Machine thePuma = MakeMachines.orderTheMachine("Vehicle");
        System.out.println(thePuma + "\n");
    }
}
