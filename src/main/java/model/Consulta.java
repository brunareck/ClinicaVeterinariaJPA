/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;
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
    
    @Column(name = "con_descricao")
    private String descricao;
    
    @Column(name = "con_animal")
    private Animal animal;
    
    @Column(name = "con_veterinario")
    private Veterinario veterinario;
    
    public Consulta(){
        animais = new ArrayList<>();
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    
     public void mostrarConsultas() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data: " + data.format(formatter));
        System.out.println("Descrição: " + descricao);
        System.out.println("Animal:");
        animal.mostrarDados();
        System.out.println("Veterinário:");
        veterinario.mostrarDados();
    }
     
     @OneToMany(mappedBy = "consulta")
    private List<Animal> animais;
    
    public List<Animal> getAnimais() { return animais; }
    public void setVendas(List<Animal> vendas) { this.animais = animais; }
}

