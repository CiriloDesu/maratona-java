package DesafioDIO;
//18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima
// na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
public class Exercicio18 {
    public static void main(String[] args) {
        int francisco = 150;
        int sara = 110;
        int anos = 0;
        while (francisco <= sara){
            francisco+= 2;
            sara+= 3;
            anos++;
        }
        System.out.println(anos);
    }
}
