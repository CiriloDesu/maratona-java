package DesafioDIO;
//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
public class Exercicio08 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 3;
//se A maior que B e A maior que C
        if (a > b && a > c){
            //faça B maior q C
            if (b > c){
                System.out.println(a +" " + b +" " + c);
            } else {
                System.out.println(a + " "+ c + " "+ b);
            }
            //B maior que A e B maior C
        } else if (b > a && b > c) {
            //
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
