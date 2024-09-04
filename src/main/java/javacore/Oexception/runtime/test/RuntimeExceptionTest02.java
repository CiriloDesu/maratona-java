package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
        divisao(1,0);
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("código finalziado");

        /**
         * @param a
         * @param b não pode ser zero
         * @return
         * @throws IllegalArgumentException caso b seja zero
         */
    }
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if ( b == 0){
            throw new IllegalArgumentException("Divisão por 0");
        }
        return a/b;
    }
}
