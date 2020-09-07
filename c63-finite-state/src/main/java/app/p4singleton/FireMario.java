package app.p4singleton;

import app.State;

/**
 * FireMario
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class FireMario implements IMario {

    private static final FireMario INSTANCE = new FireMario();

    public FireMario() {}

    public static FireMario getInstance() {
        return INSTANCE;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        // do nothing
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        // do nothing
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        // do nothing
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
