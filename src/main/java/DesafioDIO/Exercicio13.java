package DesafioDIO;

import java.util.Scanner;

// 13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Insira a idade");
        idade = sc.nextInt();

        System.out.println("Insira o nome;");
        nome = sc.nextLine();
        if (idade >= 18){
            System.out.println(nome + "você é maior de idade");
        }else {
            System.out.println(nome + "você é menor de idade");
        }
    }
}
