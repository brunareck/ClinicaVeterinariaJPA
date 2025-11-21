/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Veterinario;
/**
 *
 * @author bruna
 */
public class VeterinarioDAO extends PersistenciaJPA{
    public List<Veterinario> listaVeterinarios() {
        EntityManager em = getEntityManager();
        try{
            TypedQuery<Veterinario> query = em.createQuery("SELECT v FROM Veterinario v", Veterinario.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}