package app.p3finite;

import app.State;

/**
 * SuperMario
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SuperMario implements IMario {

    private MarioStateMachine stateMachine;

    public SuperMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom() {
        // do nothing
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
        this.stateMachine.setCurrentState(new SmallMario(this.stateMachine));
        this.stateMachine.setScore(this.stateMachine.getScore() - 100);
    }
}
