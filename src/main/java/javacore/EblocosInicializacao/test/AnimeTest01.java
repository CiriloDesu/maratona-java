package javacore.EblocosInicializacao.test;

import javacore.EblocosInicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio);
        }

    }
}
