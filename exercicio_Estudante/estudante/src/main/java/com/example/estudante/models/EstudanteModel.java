package com.example.estudante.models;


import com.example.estudante.enums.EstudanteEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_ALUNO")

public class EstudanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_aluno")
    private String nome;
    @Column(name = "email_aluno")
    private String email;

    private EstudanteEnum estudanteEnum;
    private Integer idade;


    public EstudanteModel(){

    }

    public EstudanteEnum getEstudanteEnum() {
        return estudanteEnum;
    }

    public void setEstudanteEnum(EstudanteEnum estudanteEnum) {
        this.estudanteEnum = estudanteEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}



