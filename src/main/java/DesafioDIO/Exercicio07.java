package DesafioDIO;
//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
public class Exercicio07 {
    public static void main(String[] args) {
        boolean valor1 = false;
        boolean valor2 = false;
        if (valor1 == true && valor2 == true){
            System.out.println("os dois são verdadeiros");
        } else if (valor1 == false && valor2 == false) {
            System.out.println("os dois são falsos");
        } else{
            System.out.println("são diferentes");
        }
    }
}
