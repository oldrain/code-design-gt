package app.p1branch;

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

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        if (this.currentState.equals(State.SMALL)) {
            this.currentState = State.SUPER;
            this.score += 100;
        }
    }

    public void obtainCape() {
        if (this.currentState.equals(State.SMALL) || this.currentState.equals(State.SUPER)) {
            this.currentState = State.CAPE;
            this.score += 200;
        }
    }

    public void obtainFireFlower() {
        if (this.currentState.equals(State.SMALL) || this.currentState.equals(State.SUPER)) {
            this.currentState = State.FIRE;
            this.score += 200;
        }
    }

    public void meetMonster() {
        if (this.currentState.equals(State.SUPER)) {
            this.currentState = State.SMALL;
            this.score -= 100;
            return;
        }

        if (this.currentState.equals(State.CAPE)) {
            this.currentState = State.SMALL;
            this.score -= 200;
            return;
        }

        if (this.currentState.equals(State.FIRE)) {
            this.currentState = State.SMALL;
            this.score -= 300;
            return;
        }
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }

}
