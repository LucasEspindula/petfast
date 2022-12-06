package br.com.lucasespindula.petfast.service.exception;

public class EmptyListException extends RuntimeException{
    public EmptyListException(String message) {
        super(message);
    }
}