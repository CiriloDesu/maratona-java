package javacore.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private  Endereco endereco;
    static {
        System.out.println("dentro do bloco estático pessoa");
    }
    {
        System.out.println("bloco de inicialização 1");
    }
    {
        System.out.println("bloco de inicialização 2");
    }



    public Pessoa(String nome){
        System.out.println("dentro construtor pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+ " " + endereco.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
