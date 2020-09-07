package app.p1fs;

/**
 * FileSystemNode
 *
 * @author roy
 * @version 1.0.0
 *
 */
public abstract class FileSystemNode {

    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();
    public abstract long countSizeOfFiles();

    public String getPath() {
        return this.path;
    }

}
