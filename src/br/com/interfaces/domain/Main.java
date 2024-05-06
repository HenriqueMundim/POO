package br.com.interfaces.domain;

import br.com.interfaces.domain.entities.Contract;
import br.com.interfaces.domain.interfaces.IOnlinePaymentService;
import br.com.interfaces.domain.services.ContractService;
import br.com.interfaces.domain.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), format);
        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int numberOfInsatllments = sc.nextInt();

        Contract contract = new Contract(number, date, contractValue);
        IOnlinePaymentService paymentService = new PaypalService();

        ContractService contractService = new ContractService(paymentService);
        contractService.processContract(contract, numberOfInsatllments);
        contract.showInstallments();
    }
}
