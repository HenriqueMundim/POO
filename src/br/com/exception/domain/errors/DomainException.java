package br.com.exception.domain.errors;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
