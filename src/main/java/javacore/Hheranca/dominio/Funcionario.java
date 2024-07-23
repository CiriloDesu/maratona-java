package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    static {
        System.out.println("dentro do bloco estático funcionario");
    }
    {
        System.out.println("bloco de inicialização funcionario1");
    }
    {
        System.out.println("bloco de inicialização funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("dentro construtor funcionario" +
                "");
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
}
