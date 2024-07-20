package javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int n1, int n2){
        System.out.println(n1 * n2);
    }

    public double divideDoisNumeros(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
            return n1 / n2;

    }

    public void alteraDoisNumeros(int n1, int n2){
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("n1 " + n1);
        System.out.println("n2 "+ n2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){//varargs funciona com 2 ou mais variaveis, mas ele tem que ser a última.
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}

