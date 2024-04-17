package br.com.inheritance.exe06;

public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;

    public ContaPoupanca(Cliente cliente, String numeroConta, double saldo, int diaDeRendimento) {
        super(cliente, numeroConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    public void calculaNovoSaldo(double taxa) {
        double novoSaldo = this.getSaldo() + (this.getSaldo() * taxa);
        super.setSaldo(novoSaldo);
        System.out.printf("Novo saldo: R$ %.2f\n", this.getSaldo());
    }

    @Override
    public void mostrarDadosDaConta() {
        super.mostrarDadosDaConta();
        System.out.printf("Dia de Rendimento: %d\n", this.diaDeRendimento);
    }
}
