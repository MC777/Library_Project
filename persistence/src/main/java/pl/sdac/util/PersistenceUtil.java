package pl.sdac.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library_project");

    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }

    private PersistenceUtil(){
    }
}
