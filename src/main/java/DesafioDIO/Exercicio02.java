package DesafioDIO;
//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
public class Exercicio02 {
    public static void main(String[] args) {
        int numero = 5;
        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        if(numero < 0){
            System.out.println("numero negativo");
        } else {
            System.out.println("numero positivo");
        }
    }
}
