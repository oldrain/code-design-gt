package app;

/**
 * ResourceFile
 *
 * @author roy
 * @version 1.0.0
 *
 */
public abstract class ResourceFile {

    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accept(Visitor visitor);

}
