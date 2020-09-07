package app;

import java.util.Stack;

/**
 * SnapshopHolder
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class SnapshotHolder {

    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        this.snapshots.push(snapshot);
    }

}
