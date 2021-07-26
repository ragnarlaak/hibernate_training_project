package main;
import model.Employee;
import model.Project;
import persistence.RepositoryEmployee;
import persistence.RepositoryProject;

public class Main {
    public static void main(String[] args) {
        RepositoryEmployee repo = new RepositoryEmployee();
        Employee employee = new Employee();
        employee.setFirstName("Ragnar");
        employee.setLastName("Laak");
        employee.setEmail("ragnarlaak@gmail.com");
        employee.setPhoneNumber("78849854");
        employee.setDateOfBirth("1996-07-15");
        employee.setSalary(8500);

        //repo.saveEmployee(employee);

        employee.setEmployeeId(1);
        repo.updateEmployee(employee);

        //RepositoryProject repositoryProject = new RepositoryProject();
        //Project project = new Project();
        //project.setProjectDescription("Spring framework Project");

        //repositoryProject.saveProject(project);*/

    }
}
