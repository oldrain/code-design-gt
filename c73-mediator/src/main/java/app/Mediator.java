package app;

import app.component.Component;
import app.enums.EventEnum;

/**
 * Mediator
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface Mediator {

    void handleEvent(Component component, EventEnum event);

}
