/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author bruna
 */
@Entity
@Table(name = "veterinarios")
public class Veterinario extends Pessoa implements Serializable{
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "vet_id")
    private int id;

    @Column(name = "vet_crvm")
    private String crvm;
    
    
    public String getCrvm() {
        return crvm;
    }

    public void setCrvm(String crvm) {
        this.crvm = crvm;
    }
        
    public void mostrarDados() {
        System.out.println("CRVM: " + crvm);
    }
}
