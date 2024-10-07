package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {
    private static final String PERSISTENCE = "postgres";
    private static EntityManager em;

    public static EntityManager getEntityManager() {
        if(em == null || !em.isOpen()) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE);
            em = emf.createEntityManager();
        }
        return em;
    }
}
