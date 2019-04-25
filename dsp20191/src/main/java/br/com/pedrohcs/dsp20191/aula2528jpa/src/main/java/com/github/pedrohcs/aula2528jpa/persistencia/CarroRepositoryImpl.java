package com.github.pedrohcs.aula2528jpa.persistencia;

import com.github.pedrohcs.aula2528jpa.model.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CarroRepositoryImpl implements CarroRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory(
            "com.github.pedrohcs.aula2528jpa");
    private EntityManager em;

    public CarroRepositoryImpl(){
        em = emf.createEntityManager();
    }

    public Carro create(Carro carro) {
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();
        return carro;
    }

    public Carro read(Long id) {
        Carro carro = em.find(Carro.class, id);
        return carro;
    }

    public List<Carro> findByModelo(String modelo) {
        Query query = em.createQuery("Select c from Carro c where c.modelo like :modelo");
        query.setParameter("modelo", modelo);
        return query.getResultList();
    }

    public Carro update(Carro carro) {
        em.getTransaction().begin();
        carro = em.merge(carro);
        em.getTransaction().commit();
        return carro;
    }

    public void delete(Carro carro) {
        em.getTransaction().begin();
        em.remove(carro);
        em.getTransaction().commit();
    }

    public void close() {
        emf.close();
    }
}
