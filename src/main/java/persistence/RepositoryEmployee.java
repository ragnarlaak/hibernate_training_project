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
    public void updateEmployee(Employee employee) {

        try {
            entityManager.getTransaction().begin();
            entityManager.merge(employee);
            entityManager.getTransaction().commit();
            System.out.println("Employee updated successfully!");

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    public void updateEmployeeSalary(){


            try {

                //String sql = "UPDATE Employee e SET e.salary := newSalary"; //This will be used if you want to add parameter to the method

                entityManager.getTransaction().begin();
                String sql = "UPDATE Employee e SET e.salary = e.salary + (e.salary * 0.01)";
                int result = entityManager.createQuery(sql).executeUpdate();
                entityManager.getTransaction().commit();
                if (result > 0 ) {
                    System.out.println("Employee salary updated successfully!");
                }

            }catch (Exception e){
                e.printStackTrace();
                entityManager.getTransaction().rollback();
            }

    }


    public void deleteEmployee(Employee employeeId) {


        try {
            entityManager.getTransaction().begin();
            //entityManager.remove(employeeId); <-- This is a wrong way to do this, you will get exception
            entityManager.remove(entityManager.merge(employeeId));
            entityManager.getTransaction().commit();
            System.out.println("Employee deleted successfully!");

        }catch (Exception e){
            e.printStackTrace(); //Used to find errors and prints the error in console
            entityManager.getTransaction().rollback();
        }
    }
    public List<Employee> listAllEmployees(){
        return entityManager.createQuery("FROM Employee").getResultList();
    }
    public Employee findEmployeeById(int employeeId) {
        return entityManager.find(Employee.class, employeeId);
    }

    //Second way to find employee by id
    public Employee findEmployeeById2(int employeeId) {
        String sql = "FROM Employee e WHERE e.employeeId = :id"; //: is added together with the parameter
        return entityManager
                .createQuery(sql, Employee.class) //Employee.class is added as a wrap
                .setParameter("id", employeeId)
                .getSingleResult();
    }

    public List<Employee> listAllEmployeesByDepartment(int departmentId){
        return null;
    }
}