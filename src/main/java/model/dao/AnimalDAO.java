/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
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
}
