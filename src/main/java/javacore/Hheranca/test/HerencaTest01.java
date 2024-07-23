package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("546549584");
        endereco.setRua("rua 123");
        Pessoa pessoa = new Pessoa("Minozaki Sana");
        pessoa.setCpf("15454546545");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Nome funcionaro");
        funcionario.setCpf("cpf funcionario");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(21654);
        funcionario.imprime();
    }
}
