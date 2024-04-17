package br.com.inheritance.exe06;

public class ContaBancaria {
    private Cliente cliente;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(Cliente cliente, String numeroConta, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.saldo += valor;
        }
    }

    public void mostrarDadosDaConta() {
        System.out.println("DADOS DA CONTA:");
        System.out.printf("Nome: %s\nCpf: %s\nNúmero da conta: %s\nSaldo: R$ %.2f\n", this.cliente.getNome(), this.cliente.getCpf(), this.numeroConta, this.saldo);
    }
}
