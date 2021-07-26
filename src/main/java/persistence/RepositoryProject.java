package persistence;

import model.Project;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryProject {



    private EntityManager entityManager;

    public RepositoryProject() {
        entityManager = DBUtil.getEntityManager();
    }

    public void saveProject(Project project) {


        try {
            entityManager.getTransaction().begin();
            entityManager.persist(project);
            entityManager.getTransaction().commit();
            System.out.println("Project saved successfully!");

        }catch (Exception ex) {
            entityManager.getTransaction().rollback();
        }
    }
    public void updateProject(Project project){

    }
    public void deleteProject(Project project) {

    }
    public List<Project> listAllProjects(){
        return null;
    }
    public Project findProjectBy(int project) {
        return null;
    }
}
