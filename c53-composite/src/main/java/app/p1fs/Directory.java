package app.p1fs;

import java.util.ArrayList;
import java.util.List;

/**
 * Directory
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Directory extends FileSystemNode {

    private List<FileSystemNode> subNodes = new ArrayList<>();

    public Directory(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int num = 0;
        for (FileSystemNode dir : this.subNodes) {
            num += dir.countNumOfFiles();
        }
        return num;
    }

    @Override
    public long countSizeOfFiles() {
        long size = 0;
        for (FileSystemNode dir : this.subNodes) {
            size += dir.countSizeOfFiles();
        }
        return size;
    }

    public void addSubNode(FileSystemNode dir) {
        this.subNodes.add(dir);
    }

    public void removeSubNode(FileSystemNode dir) {
        int count = this.subNodes.size();
        int i = 0;
        for (; i < count; i++) {
            if (this.subNodes.get(i).getPath().equalsIgnoreCase(dir.getPath())) {
                break;
            }
        }
        if (i < count) {
            this.subNodes.remove(i);
        }
    }

}
