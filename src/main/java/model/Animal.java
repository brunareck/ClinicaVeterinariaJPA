/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author bruna
 */
@Entity
@Table(name = "animais")
public class Animal implements Serializable{
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "ani_cod")
    private int id;
    
    @Column(name = "ani_nome")
    private String nome;
    
    @Column(name = "ani_especie")
    private Especie especie;
    
    @Column(name = "ani_idade")
    private int idade;
    
    @ManyToOne
    @JoinColumn(name = "ani_tutor", referencedColumnName = "tutor_id")
    private Tutor tutor;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public Especie getEspecie() {
        return especie;
    }
    
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    
    @Override
    public String toString() {
        return this.nome; 
    }
     public String exibirDados() {
         String aux = "Animal cadastrado:\n";
        aux += "Nome: "+nome+"\n";
        aux += "Espécie: "+especie+"\n";
        aux += "Idade: "+idade+"\n";
        aux += "Tutor: "+tutor.getNome()+"\n";
        
        return aux;
    }
     
      @OneToMany(mappedBy = "animal")
    private List<Consulta> consultas;
    
    public List<Consulta> getConsultas() { return consultas; }
    public void setConsultas(List<Consulta> animais) { this.consultas = consultas; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
