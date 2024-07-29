package DesafioDIO;
// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
//
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String alunoNome = sc.nextLine();

        System.out.println("Insira a primeira nota do aluno:");
        double nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota do aluno:");
        double nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota do aluno:");
        double nota3 = sc.nextDouble();

        System.out.println("Insira a quarta nota do aluno:");
        double nota4 = sc.nextDouble();

        double mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;

        if (mediaNota >= 7) {
            System.out.println("A nota do aluno " + alunoNome + " é " + mediaNota + " e ele está aprovado!");
        } else {
            System.out.println("A nota do aluno " + alunoNome + " é " + mediaNota + " e ele está reprovado!");
        }

        sc.close();
    }
}
