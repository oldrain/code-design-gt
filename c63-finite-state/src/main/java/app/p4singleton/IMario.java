package app.p4singleton;

import app.State;

/**
 * IMario
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface IMario {

    State getName();

    void obtainMushRoom(MarioStateMachine stateMachine);
    void obtainCape(MarioStateMachine stateMachine);
    void obtainFireFlower(MarioStateMachine stateMachine);
    void meetMonster(MarioStateMachine stateMachine);

}
