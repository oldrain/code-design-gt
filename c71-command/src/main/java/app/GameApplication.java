package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * GameApplication
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class GameApplication {

    private static final int MAX_HANDLED_REQ_COUNT_PER_LOOP = 100;

    private Queue<Command> queue = new LinkedList<>();

    public void mainLoop() {
        while (true) {
            List<Request> requests = this.getAndFormat();

            for (Request request : requests) {
                EventEnum eventEnum = request.getEventEnum();
                Data data = request.getData();
                Command command = null;
                if (eventEnum.equals(EventEnum.GOT_DIAMOND)) {
                    command = new GotDiamondCommand(data);
                } else if (eventEnum.equals(EventEnum.GOT_STAR)) {
                    command = new GotStarCommand(data);
                } else if (eventEnum.equals(EventEnum.HIT_OBSTACLE)) {
                    command = new HitObstacleCommand(data);
                } else if (eventEnum.equals(EventEnum.ARCHIVE)) {
                    command = new ArchiveCommand(data);
                }

                if (command != null) {
                    queue.add(command);
                }
            }

            int handledCount = 0;
            while (handledCount < MAX_HANDLED_REQ_COUNT_PER_LOOP) {
                if (queue.isEmpty()) {
                    break;
                }
                Command command = queue.poll();
                command.execute();
                handledCount++;
            }
        }
    }

    private List<Request> getAndFormat() {
        // .. somewhere like epoll or select
        return new ArrayList<>();
    }

}
