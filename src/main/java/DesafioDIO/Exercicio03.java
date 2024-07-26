package DesafioDIO;
//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//
//imprimir seu valor na tela
public class Exercicio03 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c;
        if (a == b){
            c = a + b;
            System.out.println("como os valores são iguais a soma deles fica: "+ c);
        } else {
            c = a * b;
            System.out.println("como os valores são diferentes, eles serão multiplicados " + c);
        }
    }
}
