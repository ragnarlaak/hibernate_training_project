package persistence;

import model.Employee;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryEmployee {


    private EntityManager entityManager;

    public RepositoryEmployee() {
        entityManager = DBUtil.getEntityManager();
    }

    public void saveEmployee(Employee employee) {


        try {
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            System.out.println("Employee saved successfully!");

        }catch (Exception ex) {
            entityManager.getTransaction().rollback();
        }
    }
    public void updateEmployee(Employee employee){

        try {
            entityManager.getTransaction().begin();
            entityManager.merge(employee);
            entityManager.getTransaction().commit();
            System.out.println("Employee updated successfully!");

        }catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }
    public void deleteEmployee(Employee employeeId) {


        try {
            entityManager.getTransaction().begin();
            entityManager.remove(employeeId);
            entityManager.getTransaction().commit();
            System.out.println("Employee deleted successfully!");

        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }
    public List<Employee> listAllEmployees(){
        return null;
    }
    public Employee findEmployeeBy(int employee) {
        return null;
    }

    public List<Employee> listAllEmployeesByDepartment(int departmentId){
        return null;
    }
}
