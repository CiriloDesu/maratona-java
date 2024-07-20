package javacore.FmodificadoreEstatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    static {
        System.out.println("bloco inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        //0- bloco e inicialização é executado quando a JVM carregar classe
        //1- alocado espço em memória para o objeto
        //cada atributo da classe é criado e inicializado com valores default ou que for passado
        //3- bloco de inicalização é executado
        //4- construtor é executado
        //é alterado ao usar heraça e blocos estáticos
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {

        for (int episodio: Anime.episodios){
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
