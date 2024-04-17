package br.com.inheritance.exe04;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(String numero, double saldo, double chequeEspecial) {
        super(numero, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

}
