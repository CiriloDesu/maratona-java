package javacore.Gassociacao.Teste;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Girafales");
        Professor professor2 = new Professor("Girafales2");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Escolinha", professores);

        escola.imprime();
    }
}
