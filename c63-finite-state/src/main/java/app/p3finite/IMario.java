package app.p3finite;

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

    void obtainMushRoom();
    void obtainCape();
    void obtainFireFlower();
    void meetMonster();

}
