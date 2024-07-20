package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 5);
        System.out.println(resultado);
    }
}
