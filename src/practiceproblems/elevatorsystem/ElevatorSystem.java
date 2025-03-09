package practiceproblems.elevatorsystem;

import practiceproblems.elevatorsystem.dispatchstrategies.DispatchStragegy;


public class ElevatorSystem {
    private static ElevatorSystem elevatorSystem;
    private DispatchStragegy dispatchStragegy;
//    private Building building;

    public void monitoring() {

    }

    public void dispatch() {

    }

    private ElevatorSystem() {
    }

    public static ElevatorSystem getInstance() {
        if (elevatorSystem == null) {
            elevatorSystem = new ElevatorSystem();
        }
        return elevatorSystem;
    }

//    public void setBuilding(Building building) {
//        this.building = building;
//    }

    public void setDispatchStragegy(DispatchStragegy dispatchStragegy) {
        this.dispatchStragegy = dispatchStragegy;
    }
}
