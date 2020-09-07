package app.p2hr;

/**
 * Employee
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Employee extends HumanResource {

    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return this.salary;
    }

}
