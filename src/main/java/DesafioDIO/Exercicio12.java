package DesafioDIO;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do produto.");
        double valorItem = sc.nextDouble();
        System.out.println("Escola forma de pagamento:");
        System.out.println(" 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                "\n" +
                " 2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                "\n" +
                " 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                "\n" +
                " 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int escolha = sc.nextInt();
        if(escolha == 1){
            valorItem = (valorItem * 0.15) - valorItem;
            System.out.println("O novo valor item será de: R$"+ valorItem);
        } else if (escolha == 2) {

            valorItem = (valorItem * 0.10) - valorItem;
            System.out.println("O novo valor do item será de: R$"+ valorItem);
        } else if (escolha == 3) {
            System.out.println("O parcelamento em 2x sem juros do produto vai ser 2x de: R$" + valorItem/2);
        } else {
            valorItem = (valorItem * 0.10) + valorItem;
            System.out.println("O parcelamento de 3x ou mais com juros, será R$"+ valorItem + "com juros a 10%");
        }
    }
}
