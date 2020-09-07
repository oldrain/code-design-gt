package app.p2hr;

import java.util.ArrayList;
import java.util.List;

/**
 * Department
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class Department extends HumanResource {

    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;
        for (HumanResource hr : this.subNodes) {
            totalSalary += hr.calculateSalary();
        }
        this.salary = totalSalary;
        return totalSalary;
    }

    public void addSubNode(HumanResource hr) {
        this.subNodes.add(hr);
    }

}
