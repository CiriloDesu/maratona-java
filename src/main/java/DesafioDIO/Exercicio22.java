package DesafioDIO;
//22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os valores A e B abaixo para saber qual é o quciente e o resto da divisão inteira entre eles: ");
        System.out.println("Insira o valor de A(dividendo):");
        int valorA = sc.nextInt();
        System.out.println("Insira o valor de B(divisor):");
        int valorB = sc.nextInt();
        // Verificar se o divisor é zero para evitar divisão por zero
        if (valorB == 0) {
            System.out.println("Erro: Divisor não pode ser zero.");
        } else {
            // Calcular e imprimir o quociente e o resto
            int quociente = valorA / valorB;
            int resto = valorA % valorB;

            System.out.println("O quociente da divisão entre A e B é: " + quociente);
            System.out.println("O resto da divisão entre A e B é: " + resto);
        }
        sc.close();
    }
}
