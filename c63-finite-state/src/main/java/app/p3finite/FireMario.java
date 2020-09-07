package app.p3finite;

import app.State;

/**
 * FireMario
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class FireMario implements IMario {

    private MarioStateMachine stateMachine;

    public FireMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
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
        this.stateMachine.setScore(this.stateMachine.getScore() - 300);
    }
}
