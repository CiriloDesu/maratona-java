package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();


        estudante1.nome = "Eu";
        estudante1.idade = 34;
        estudante1.sexo = 'L';

        estudante2.nome = "ELA";
        estudante2.idade = 34;
        estudante2.sexo = 'M';

        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);



    }

}
