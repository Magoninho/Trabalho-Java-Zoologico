package com.mago.zoologico.Funcionarios;

public abstract class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public abstract void trabalhar();
}