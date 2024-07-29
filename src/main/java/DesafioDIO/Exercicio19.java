package DesafioDIO;
// Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
public class Exercicio19 {
    public static void main(String[] args) {
        for (int n1 = 1; n1 <= 10; n1++) {
            System.out.println("Tabuada do " + n1 + ":");

            // Loop interno para multiplicar de 1 a 10
            for (int n2 = 1; n2 <= 10; n2++) {
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            }

            // Linha em branco para separar as tabuadas
            System.out.println();
        }
    }
}
