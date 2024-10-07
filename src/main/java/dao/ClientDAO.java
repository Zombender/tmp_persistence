package dao;

import interfaces.IClient;
import models.Client;
import jakarta.persistence.EntityManager;
import java.util.List;

/*
* Custom query
* List<Client> clients = em.createQuery("SELECT c FROM Client c WHERE c.name LIKE :namePattern", Client.class)
                              .setParameter("namePattern", "%" + namePattern + "%")
                              .getResultList();
* */
public class ClientDAO implements IClient {
    @Override
    public void save(Client client) {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Client> getClients() {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        em.getTransaction().begin();
        return em.createQuery("from Client", Client.class).getResultList();
    }

    @Override
    public void update(Client client) {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        em.getTransaction().begin();
        em.merge(client);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Client client) {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        em.getTransaction().begin();
        em.remove(client);
        em.getTransaction().commit();
        em.close();
    }
}
