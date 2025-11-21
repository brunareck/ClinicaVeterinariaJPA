/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Tutor;

/**
 *
 * @author bruna
 */
public class TutorDAO extends PersistenciaJPA{
    public List<Tutor> listaTutors() {
        EntityManager em = getEntityManager();
        try{
            TypedQuery<Tutor> query = em.createQuery("SELECT t FROM Tutor t", Tutor.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}