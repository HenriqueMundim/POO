package br.com.inheritance.exe05;

public class Gerente extends Funcionario{
    private String senha;
    private int tempoDeEmpresa;

    public Gerente(String nome, String cpf, double salario, String senha, int tempoDeEmpresa) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.tempoDeEmpresa = tempoDeEmpresa;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTempoDeEmpresa() {
        return tempoDeEmpresa;
    }

    public void setTempoDeEmpresa(int tempoDeEmpresa) {
        this.tempoDeEmpresa = tempoDeEmpresa;
    }
}
