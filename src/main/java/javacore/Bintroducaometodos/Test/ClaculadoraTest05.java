package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class ClaculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8); //gostei disso, é o mesmo disso^^
    }
}
