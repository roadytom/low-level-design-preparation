package practiceproblems.elevatorsystem.dispatchstrategies;

import practiceproblems.elevatorsystem.Request;

public interface DispatchStragegy {
    int selectElevator(Request request);
}
