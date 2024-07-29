package DesafioDIO;

import java.util.Scanner;

//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual tabuada que você deseja, exemplo: 10");
        int tabuada = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println("A tabuada de " + tabuada + " x " + i +" = "+ (i * tabuada));
        }
    }
}
