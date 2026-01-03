package org.example;

public class Estagiario extends Funcionario{
    @Override
    public double calcularSalario() {
        return salarioBase * 0.80;
    }

    @Override
    public String getNome() {
        return "Estagiário: "+nome;
    }
}
