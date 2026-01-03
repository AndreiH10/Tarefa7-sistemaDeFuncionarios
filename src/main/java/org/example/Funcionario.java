package org.example;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase = 2000;

    public abstract double calcularSalario();

    public String getNome(){
        return nome;
    }
}
