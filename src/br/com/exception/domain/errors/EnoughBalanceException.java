package br.com.exception.domain.errors;

public class EnoughBalanceException extends DomainException{
    public EnoughBalanceException(String message) {
        super(message);
    }
}
