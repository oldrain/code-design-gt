package app.p2hr;

/**
 * HumanResource
 *
 * @author roy
 * @version 1.0.0
 *
 */
public abstract class HumanResource {

    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public abstract double calculateSalary();

}
