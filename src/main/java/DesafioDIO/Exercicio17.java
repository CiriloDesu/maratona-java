package DesafioDIO;

import java.util.Scanner;

//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * ( F-32) / 9)
public class Exercicio17 {
    public static void main(String[] args) {
        System.out.println("Insira a temperatura em Fahrenheit para converter em Celsius: ");
        double fahrenheit;
        double celsius;
        Scanner sc = new Scanner(System.in);
        fahrenheit = sc.nextDouble();
        celsius = (5 * (fahrenheit-32) /9);
        System.out.println("A temperatura em Fahrenheit é: "+ fahrenheit + "e a temperatura em Celsius é: " + celsius);
    }
}
