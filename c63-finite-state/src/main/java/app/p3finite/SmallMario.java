package app.p3finite;

import app.State;

/**
 * SmallMario
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SmallMario implements IMario {

    private MarioStateMachine stateMachine;

    public SmallMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }


    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        this.stateMachine.setCurrentState(new SuperMario(this.stateMachine));
        this.stateMachine.setScore(this.stateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape() {
        this.stateMachine.setCurrentState(new CapeMario(this.stateMachine));
        this.stateMachine.setScore(this.stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
        this.stateMachine.setCurrentState(new FireMario(this.stateMachine));
        this.stateMachine.setScore(this.stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster() {
        // do nothing
    }
}
