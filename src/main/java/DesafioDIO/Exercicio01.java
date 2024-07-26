package DesafioDIO;
//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
public class Exercicio01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int soma = a + b;
        if(soma < c){
            System.out.println("a soma de a + b = " + soma + " e a soma é menor que C");
        } else {
            System.out.println("a soma de a + b = " + soma + " e a soma é maior ou igual a C");
        }
    }
}
