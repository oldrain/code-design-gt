package app.singleton.p3;

/**
 * FileSharedObjectStorage
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class FileSharedObjectStorage<T> implements SharedObjectStorage<T> {

    @Override
    public T load(Class<T> tClass) {
        return null;
    }

    @Override
    public void save(T obj, Class<T> tClass) {
        //
    }

}
