package headfirst.myimplementation.practice.elevatorsystem.dispatchstrategies;

import headfirst.myimplementation.practice.elevatorsystem.Request;

public interface DispatchStragegy {
    int selectElevator(Request request);
}
