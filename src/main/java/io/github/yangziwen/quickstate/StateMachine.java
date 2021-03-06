package io.github.yangziwen.quickstate;

import java.util.List;

public interface StateMachine<S, E, C> extends Visitable {

    String getId();

    List<State<S, E, C>> getAllStates();

    List<Transition<S, E, C>> getTransitions(S source);

    S fire(S source, E event, C context);

    boolean canApply(S source, E event);

}
