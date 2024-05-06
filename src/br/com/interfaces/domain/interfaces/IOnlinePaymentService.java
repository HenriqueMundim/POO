package br.com.interfaces.domain.interfaces;

public interface IOnlinePaymentService {
    double paymentfee(double amount);
    double interest(double amount, int months);
}
