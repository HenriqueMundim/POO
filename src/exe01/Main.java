package exe01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta[] contas = new Conta[3];
        UtilitarioConta utilitario = new UtilitarioConta();

        for (int i = 0; i < contas.length; i++) {
            System.out.print("Digite o número da conta: ");
            String numero = sc.next();
            System.out.print("Digite o saldo inicial da conta: ");
            double saldo = sc.nextDouble();

            contas[i] = new Conta(numero, saldo);
        }

        utilitario.imprimirContas(contas);
        utilitario.somarSaldos(contas);
        sc.close();
    }
}
