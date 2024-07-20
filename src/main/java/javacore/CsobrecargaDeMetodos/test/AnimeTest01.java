package javacore.CsobrecargaDeMetodos.test;

import javacore.CsobrecargaDeMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Danshi koukouse no nichijou", "TV", 12);
//        anime.setNome("Danshi koukouse no nichijou");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.imprime();

    }
}
