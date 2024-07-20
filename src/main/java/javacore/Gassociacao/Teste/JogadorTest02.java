package javacore.Gassociacao.Teste;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        jogador1.imprime();
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        System.out.println("----------");
        jogador1.imprime();
        jogador1.setTime(time);
    }
}
