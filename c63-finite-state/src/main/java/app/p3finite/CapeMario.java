package app.p3finite;

import app.State;

/**
 * CapeMario
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class CapeMario implements IMario {

    private MarioStateMachine stateMachine;

    public CapeMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void obtainMushRoom() {
        // do nothing
    }

    @Override
    public void obtainCape() {
        // do nothing
    }

    @Override
    public void obtainFireFlower() {
        // do nothing
    }

    @Override
    public void meetMonster() {
        this.stateMachine.setCurrentState(new SmallMario(this.stateMachine));
        this.stateMachine.setScore(this.stateMachine.getScore() - 200);
    }
}
