package br.com.interfaces.domain.services;

import br.com.interfaces.domain.entities.Contract;
import br.com.interfaces.domain.entities.Installment;
import br.com.interfaces.domain.interfaces.IOnlinePaymentService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContractService {
    private IOnlinePaymentService paymentService;

    public ContractService(IOnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months) {
        double valueInstallment = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double paymenFee = paymentService.paymentfee(valueInstallment);
            double interest = paymentService.interest(valueInstallment + paymenFee, i);

            LocalDate installmentDate = contract.getDate().plusMonths(i);
            double totalValueInstallment = valueInstallment + paymenFee + interest;

            contract.getInstallments().add(new Installment(installmentDate, totalValueInstallment));
        }
    }
}
