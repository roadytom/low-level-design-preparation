package headfirst.myimplementation.practice.elevatorsystem;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Building {
    private final List<Floor> floors;
    private final List<ElevatorCar> elevatorCars;

    public Building(int floorCount, int elevatorCount) {
        this.floors = Stream.generate(Floor::new).limit(floorCount).collect(Collectors.toList());
        this.elevatorCars = Stream.generate(ElevatorCar::new).limit(elevatorCount).collect(Collectors.toList());
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public List<ElevatorCar> getElevatorCars() {
        return elevatorCars;
    }
}
