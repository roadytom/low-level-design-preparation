package headfirst.myimplementation.practice.elevatorsystem;

import headfirst.myimplementation.practice.elevatorsystem.dispatchstrategies.DispatchStragegy;
import headfirst.myimplementation.practice.elevatorsystem.display.Display;
import headfirst.myimplementation.practice.elevatorsystem.panel.HallPanel;

import java.util.List;

public class ElevatorSystem {
    private static ElevatorSystem elevatorSystem;
    private DispatchStragegy dispatchStragegy;
    private Building building;

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

    public void setBuilding(Building building) {
        this.building = building;
    }

    public void setDispatchStragegy(DispatchStragegy dispatchStragegy) {
        this.dispatchStragegy = dispatchStragegy;
    }
}
