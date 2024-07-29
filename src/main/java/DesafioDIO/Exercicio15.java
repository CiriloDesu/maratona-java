package DesafioDIO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

//15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.
public class Exercicio15 {
    public static void main(String[] args) {
        // Obtém o ano atual
        int anoAtual = LocalDateTime.now().getYear();
        // Cria um scanner para leitura de entrada
        Scanner sc = new Scanner(System.in);
        // Pede ao usuário para inserir o ano de nascimento
        System.out.println("Insira o ano em que você nasceu!");
        int anoNascimento = sc.nextInt();
        // Calcula a idade em anos
        int anos = anoAtual - anoNascimento;
        // Calcula a idade em meses e dias com base em um ano de 365 dias e um mês de 30 dias
        int meses = anos * 12;
        int dias = anos * 365;
        // Imprime a idade em anos, meses e dias
        System.out.println("Você tem " + anos + " anos, " + meses + " meses, e " + dias + " dias.");
        // Fecha o scanner
        sc.close();
    }
}