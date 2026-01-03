package org.example;

public class Vendedor extends Funcionario{
    @Override
    public double calcularSalario() {
        return salarioBase * 1.05;
    }

    @Override
    public String getNome() {
        return "Vendedor: "+nome;
    }
}
