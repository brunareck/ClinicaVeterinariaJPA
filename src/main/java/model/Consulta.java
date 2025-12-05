/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author bruna
 */
@Entity
@Table(name = "consultas")
public class Consulta implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "con_id")
    private int id;
    
    @Column(name = "con_data")
    private LocalDate data;
    
    @ManyToOne
    @JoinColumn(name = "con_veterinario")
    private Veterinario veterinario;
    
    @ManyToOne
    @JoinColumn(name = "con_tutor")
    private Tutor tutor;

    @Column(name = "con_valor")
    private Double valor;
    
    @ManyToOne
    @JoinColumn(name = "con_animal")
    private Animal animal;
    
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return this.getData().toString(); 
}

     public String exibirDados() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String aux = "Consulta cadastrada:\n";
        aux += data.format(formatter) + "\n";
        aux += "Animal: "+getAnimal().getNome()+"\n";
        aux += "Veterinário: "+getVeterinario().getNome()+"\n";
        aux += "Tutor: "+getTutor().getNome()+"\n";
        aux += "Valor: " + valor + "\n";
        return aux;
     }
}

