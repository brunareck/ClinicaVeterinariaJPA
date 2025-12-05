/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Consulta;
/**
 *
 * @author bruna
 */
public class ConsultaDAO extends PersistenciaJPA {
    public List<Consulta> listaConsultas() {
        EntityManager em = getEntityManager();
        try{
            TypedQuery<Consulta> query = em.createQuery("SELECT c FROM Consulta c", Consulta.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
