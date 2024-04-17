package br.com.inheritance.exe06;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(Cliente cliente, String numeroConta, double saldo, double limite) {
        super(cliente, numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = this.getSaldo() + this.limite;
        if (saldoDisponivel - valor > 0) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Limite indisponível");
        }
    }

    @Override
    public void mostrarDadosDaConta() {
        super.mostrarDadosDaConta();
        System.out.printf("Limite: %.2f\n", this.limite);
    }
}
