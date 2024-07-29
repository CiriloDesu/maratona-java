package DesafioDIO;

import java.util.Scanner;

//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//
//equilátero, isósceles ou escaleno.
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double trian1 = sc.nextDouble();
        double trian2 = sc.nextDouble();
        double trian3 = sc.nextDouble();

        if(trian1 == trian2 && trian1 == trian3){
            System.out.println("O triangulo é equilatero");
        }else if (trian1 == trian2 || trian1 == trian3 || trian2 == trian3) {
            System.out.println("o triango é isósceles");
        } else {
            System.out.println("triangulo escaleno");
        }
        sc.close();
    }
}
