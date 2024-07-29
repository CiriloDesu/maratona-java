package DesafioDIO;
//Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
// Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a
// quantidade de litros utilizados para fazer a viagem.
//Fórmula: distância = tempo x velocidade.
//            litros usados = distância / 12.

import java.util.Scanner;

public class Exercicio23ou22 {
    public static void main(String[] args) {
        System.out.println("Insira as informações abaixo para saber a distância percorrida e o combustível usado:");
        Scanner sc = new Scanner(System.in);

        // Solicitar ao usuário o tempo gasto e a velocidade média
        System.out.print("Tempo gasto (em horas): ");
        double tempoGastoViagem = sc.nextDouble();

        System.out.print("Velocidade média (em km/h): ");
        double velocidadeMedia = sc.nextDouble();

        // Calcular a distância percorrida
        double distanciaPercorrida = tempoGastoViagem * velocidadeMedia;

        // Calcular a quantidade de litros utilizados
        double quantidadeLitrosUtilizados = distanciaPercorrida / 12.0; // Usar 12.0 para garantir precisão

        // Exibir os resultados
        System.out.printf("A distância percorrida foi de: %.2f km%n", distanciaPercorrida);
        System.out.printf("A quantidade de gasolina utilizada foi de: %.2f litros%n", quantidadeLitrosUtilizados);

        // Fechar o scanner
        sc.close();
    }
}
