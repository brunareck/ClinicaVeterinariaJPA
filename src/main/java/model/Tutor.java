/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author bruna
 */
@Entity
@Table(name = "tutores")
public class Tutor extends Pessoa implements Serializable{
     
    @Id
    @Column(name = "tutor_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
     public Tutor(){
        animais = new ArrayList<>();
    }
    @Override
    public String toString() {
        return this.getNome();
}


    @OneToMany(mappedBy = "tutor")
    private List<Animal> animais;
    
    public List<Animal> getAnimais() { return animais; }
}
