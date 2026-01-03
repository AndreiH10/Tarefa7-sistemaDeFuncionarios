package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Vendedor();
        Funcionario f3 = new Estagiario();

        f1.nome = "Andrei";
        f2.nome = "Aline";
        f3.nome = "Aline também";

        System.out.println(
                f1.getNome()+"\n"+f1.calcularSalario()+"\n"
                        +"------------------\n"+
                f2.getNome()+"\n"+f2.calcularSalario()+"\n"
                        +"------------------\n"+
                f3.getNome()+"\n"+f3.calcularSalario()
        );
    }
}
