package javacore.LclassesAbstratas.test;

import javacore.LclassesAbstratas.dominio.Desenvolvedor;
import javacore.LclassesAbstratas.dominio.Funcionario;
import javacore.LclassesAbstratas.dominio.Gerente;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5200);
         System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("ASasad", 15165);
        System.out.println(desenvolvedor);
    }

}
