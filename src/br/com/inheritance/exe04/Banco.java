package br.com.inheritance.exe04;

public class Banco {
    private ContaCorrente[] contas;
    private ContaPoupanca[] poupancas;
    private int numeroContas, numeroPoupancas;

    public Banco() {
        this.contas = new ContaCorrente[100];
        this.poupancas = new ContaPoupanca[100];
        this.numeroContas = 0;
        this.numeroPoupancas = 0;
    }

    public void abreConta(String numero, double saldo, double chequeEspecial) {
        this.contas[this.numeroContas] = new ContaCorrente(numero, saldo, chequeEspecial);
        this.numeroContas++;
    }

    public void abrePoupanca(String numero, double saldo) {
        poupancas[this.numeroPoupancas] = new ContaPoupanca(numero, saldo);
        this.numeroPoupancas++;
    }

    public void abrirFalencia() {
        for (ContaCorrente conta : this.contas) {
            conta = null;
        }

        for (ContaPoupanca poupanca : this.poupancas) {
            poupanca = null;
        }
    }
}
