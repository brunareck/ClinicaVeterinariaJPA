/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
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
    private LocalDateTime data;
    
    @Column(name = "con_descricao")
    private String descricao;
    
    @Column(name = "con_animal")
    private Animal animal;
    
    @Column(name = "con_veterinario")
    private Veterinario veterinario;
    
    @Column(name = "con_tutor")
    private Tutor tutor;

    @Column(name = "con_valor")
    private Double valor;
    
    public Consulta(){
        animais = new ArrayList<>();
    }
    
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
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
    
     public String exibirDados() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String aux = "Consulta cadastrada:\n";
        aux += data.format(formatter) + "\n";
        aux += descricao + "\n";
        aux += "Animal: "+getAnimal().getNome()+"\n";
        animal.exibirDados();
        aux += "Veterinário: "+getVeterinario().getNome()+"\n";
        veterinario.mostrarDados();
        aux += "Tutor: "+getTutor().getNome()+"\n";
        aux += "Valor: " + valor + "\n";
        return aux;
    }
     
     @OneToMany(mappedBy = "consulta")
    private List<Animal> animais;
    
    public List<Animal> getAnimais() { return animais; }
    public void setVendas(List<Animal> vendas) { this.animais = animais; }

}

