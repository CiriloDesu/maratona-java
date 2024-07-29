package DesafioDIO;
//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
public class Exercicio14 {
    public static void main(String[] args) {
        int valorA = 1;
        int valorB = 2;

        int intermedio = valorA;
        int intermedio2 = valorB;
        valorA = intermedio2;
        valorB = intermedio;
        System.out.println(valorA + " " + valorB);
    }
}
