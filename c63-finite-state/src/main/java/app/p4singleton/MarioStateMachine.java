package app.p4singleton;

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
    private IMario currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = SmallMario.getInstance();
    }

    public void obtainMushRoom() {
        this.currentState.obtainMushRoom(this);
    }

    public void obtainCape() {
        this.currentState.obtainCape(this);
    }

    public void obtainFireFlower() {
        this.currentState.obtainFireFlower(this);
    }

    public void meetMonster() {
        this.currentState.meetMonster(this);
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public State getCurrentState() {
        return currentState.getName();
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }

}
