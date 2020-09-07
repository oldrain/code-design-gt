package app.p2table;

import app.Event;
import app.State;

/**
 * MarioStateMachine
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class MarioStateMachine {

    private int score;
    private State currentState;

    private static final State[][] transitionTable = {
            {State.SUPER, State.CAPE, State.FIRE, State.SMALL},
            {State.SUPER, State.CAPE, State.FIRE, State.SMALL},
            {State.CAPE, State.CAPE, State.CAPE, State.SMALL},
            {State.FIRE, State.FIRE, State.FIRE, State.SMALL},
    };

    private static final int[][] actionTable = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300},
    };

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        this.executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        this.executeEvent(Event.GOT_CAP);
    }

    public void obtainFireFlower() {
        this.executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        this.executeEvent(Event.MET_MONSTER);
    }

    private void executeEvent(Event event) {
        int stateValue = this.currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[stateValue][eventValue];
        this.score = actionTable[stateValue][eventValue];
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }

}
