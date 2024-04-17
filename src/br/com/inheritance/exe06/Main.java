package br.com.inheritance.exe06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaPoupanca contaPoupanca;
        ContaEspecial contaEspecial;

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu cpf: ");
        String cpf = sc.next();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Qual tipk de conta quer abrir poupança (P) ou especial (E)? ");
        char tipoConta = sc.next().charAt(0);

        Cliente cliente = new Cliente(nome, cpf, idade);

        if (tipoConta == 'P') {
             contaPoupanca = new ContaPoupanca(cliente, "111-11", 2000, 15);
            contaPoupanca.depositar(1000);
            contaPoupanca.sacar(1500);
            contaPoupanca.calculaNovoSaldo(0.05);
            contaPoupanca.mostrarDadosDaConta();
        }
        if (tipoConta == 'E') {
            contaEspecial = new ContaEspecial(cliente, "222-", 2000, 100);
        }
    }
}
