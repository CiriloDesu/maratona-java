package javacore.Gassociacao.Teste;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Aracaju");
        Aluno aluno = new Aluno("Eu", 18);
        Professor professor = new Professor("Ele", "negoço");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Seminaro", alunosSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();

    }
}
