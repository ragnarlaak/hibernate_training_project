package model;

import javax.persistence.*;

@Entity
@Table(name = "Projects")

public class Project {
    @Id  //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectID;

    @Column(name = "Project")

    private String projectDescription;

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {

    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    @Override
    public String toString() {
        return "Project{" +
                "ProjectID=" + projectID +
                ", projectDescription='" + projectDescription + '\'' +
                '}';
    }
}
