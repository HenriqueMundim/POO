package exe01;

public class UtilitarioConta {
    public void imprimirContas(Conta[] contas) {
        for (Conta conta : contas) {
            System.out.printf("Numero da conta: %s\nSaldo da conta: R$ %.2f\n", conta.getNumber(), conta.getBalance());
        }
    }
    public void somarSaldos(Conta[] contas) {
        double sum = 0;
        for (Conta conta : contas){
            sum += conta.getBalance();
        }
        System.out.println(sum);
    }
}
