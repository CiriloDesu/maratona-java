package javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;

    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.especialidade = especialidade;
        this.nome = nome;
    }
    public Professor(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Professor: "+this.nome);
        if (this.seminarios == null) return;
        System.out.println("Seminarios Cadastradas: ");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEnereco());
            if (seminario.getAlunos() == null) continue;
            System.out.println("alunos: ");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+ aluno.getNome() + "idade " + aluno.getIdade());
            }

        }

    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
