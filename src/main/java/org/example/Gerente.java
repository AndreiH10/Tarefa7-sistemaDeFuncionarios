package org.example;

public class Gerente extends Funcionario{
    @Override
    public double calcularSalario() {
        return +salarioBase * 1.60;
    }

    @Override
    public String getNome() {
        return "Gerente: "+nome;
    }
}
