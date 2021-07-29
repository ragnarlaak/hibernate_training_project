package main;
import model.Employee;
import model.Project;
import persistence.RepositoryEmployee;
import persistence.RepositoryProject;

import java.util.List;

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



        //employee.setEmployeeId(1); // Don't use when saving a new employee to table etc...


        //repo.saveEmployee(employee);
        //repo.deleteEmployee(employee);
        //repo.updateEmployee(employee);
        //repo.updateEmployeeSalary();


//        List <Employee> list = repo.listAllEmployees();
//        for (Employee employee1: list){
//            System.out.println(employee1.toString());
//
//        }

        Employee employee1 = repo.findEmployeeById(1);
        System.out.println(employee1);


        //RepositoryProject repositoryProject = new RepositoryProject();
        //Project project = new Project();
        //project.setProjectDescription("Spring framework Project");

        //repositoryProject.saveProject(project);*/

    }
}
