package app.singleton.p3;

/**
 * storage
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface SharedObjectStorage<T> {

    /**
     * load
     *
     * <p>
     * @param tClass tClass
     * @return T
     * @author roy
     *
     */
    T load(Class<T> tClass);

    /**
     * save
     *
     * <p>
     * @param obj obj
     * @param tClass tClass
     * @author roy
     *
     */
    void save(T obj, Class<T> tClass);

}
