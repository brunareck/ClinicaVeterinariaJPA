# 🐾 Sistema de Gerenciamento para Clínica Veterinária

Aplicação **Java Swing + JPA/Hibernate + PostgreSQL** para gestão de cadastros e consultas em uma clínica veterinária.

---

## 📄 Visão Geral

Este projeto permite gerenciar **Animais**, **Tutores**, **Consultas** e demais dados de forma organizada, com interface gráfica e persistência de dados.  
Ele demonstra a aplicação de conceitos de **POO (Programação Orientada a Objetos)**, **persistência com JPA/Hibernate**.

---

## ✨ Principais Destaques Técnicos

- **Persistência com JPA/Hibernate**  
  Uso de entidades anotadas (`@Entity`, `@Id`, `@GeneratedValue`, relacionamentos `@ManyToOne`, `@OneToMany`) para modelar classes como Animal, Tutor, Consulta etc.  

- **Camada DAO**  
  DAO responsável por operações de persistência e remoção, com controle de transações (`commit`, `rollback`) e gerenciamento adequado do `EntityManager`.  

- **Interface GUI com Java Swing (MVC básico)**  
  Utilização de `JFrame`, `JDialog`, organização das telas na pasta `view/`.  

- **Tabela com ID Oculto (JTable)**  
  Implementação de `JTable`.

- **Relacionamentos entre Entidades com Integridade Referencial**  
  Por exemplo, a entidade `Animal` se relaciona a um `Tutor` via `@ManyToOne`.

---

## 📂 EDiagrama

<img width="617" height="601" alt="Diagrama sem nome drawio (1)" src="https://github.com/user-attachments/assets/661906f1-384f-4cee-8bf8-00e1b9b3bc3a" />


