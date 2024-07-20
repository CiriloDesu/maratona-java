package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados(){
        System.out.println("nome "+ this.nome);
        System.out.println("idade "+ this.idade);
        if (salarios != null) {
            for (double salario: salarios){
                System.out.println("salário " + salario);
            }
        }

    }

    public void imprimeMediaSalario(){
        double media = 0;
       if(salarios != null) {
           for (double salario : salarios) {
               media += salario;
           }
       }
       if (salarios != null) {
           System.out.println("a média de salário é: " + media / salarios.length);
       }
    }


}


