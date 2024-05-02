package br.com.exception.domain.errors;

public class WithdrawLimitException extends DomainException{
    public WithdrawLimitException(String message) {
        super(message);
    }
}
