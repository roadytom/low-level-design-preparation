package headfirst.myimplementation.practice.elevatorsystem;

public class Door {
    private DoorState doorState;

    public boolean isOpen() {
        return doorState == DoorState.OPEN;
    }
}
