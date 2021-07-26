package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class EmployeeProject {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment

    private int employeeProjectId;
    private int projectId;
    private int employeeId;

    public int getEmployeeProjectId() {
        return employeeProjectId;
    }

    public void setEmployeeProjectId(int employeeProjectId) {
        this.employeeProjectId = employeeProjectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "EmployeeProject{" +
                "employeeProjectId=" + employeeProjectId +
                ", projectId=" + projectId +
                ", employeeId=" + employeeId +
                '}';
    }
}
