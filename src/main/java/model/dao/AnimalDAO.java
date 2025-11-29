/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Animal;
/**
 *
 * @author bruna
 */
public class AnimalDAO extends PersistenciaJPA {
    public List<Animal> listaAnimais() {
        EntityManager em = getEntityManager();
        try{
            TypedQuery<Animal> query = em.createQuery("SELECT a FROM Animal a", Animal.class);
            return query.getResultList();
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public Optional<Animal> buscarPorCodigo(int codigo){
        EntityManager em = getEntityManager();
        try{
             TypedQuery<Animal> query = em.createQuery(
                    "SELECT a FROM Animal a WHERE a.codigo = :codigo", Animal.class);
            query.setParameter("codigo", codigo);
            return query.getResultList().stream().findFirst();
        } finally {
            em.close();
        }
    }
    
    public List<Animal> listaAnimais(String nome) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Animal> query
                    = em.createQuery("SELECT a FROM Veiculo a where a.placa like :nome", Animal.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
