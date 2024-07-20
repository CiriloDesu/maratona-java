package introducao;

public class Aula04Operadores {

    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println(isDezDiferenteDez);

        // && and / || or
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrista = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrista);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 1000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);


        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; // 1800
        bonus *= 2;
        System.out.println(bonus);
    }
}
