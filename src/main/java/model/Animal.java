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
@Table(name = "animais")
public class Animal implements Serializable{
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "ani_id")
    private int id;
    
    @Column(name = "ani_cod")
    private int codigo;
    
    @Column(name = "ani_nome")
    private String nome;
    
    @Column(name = "ani_especie")
    private Especie especie;
    
    @Column(name = "ani_idade")
    private int idade;
    
    @Column(name = "ani_tutor")
    private Tutor tutor;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     public String exibirDados() {
         String aux = "Animal cadastrado:\n";
        aux += "Código: "+codigo+"\n";
        aux += "Nome: "+nome+"\n";
        aux += "Espécie: "+especie+"\n";
        aux += "Idade: "+idade+"\n";
        aux += "Tutor: "+tutor.getNome()+"\n";
        
        return aux;
    }
}
