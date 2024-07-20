package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "funcionario";
        funcionario.idade = 4545;
//        funcionario.salarios = new double[]{1200, 1533, 1544};
        funcionario.imprimeDados();

        System.out.println("**************************");
        funcionario.imprimeMediaSalario();
    }
}
