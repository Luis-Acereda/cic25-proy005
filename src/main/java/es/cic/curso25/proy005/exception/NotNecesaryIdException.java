package es.cic.curso25.proy005.exception;

public class NotNecesaryIdException extends RuntimeException {

    public NotNecesaryIdException(){}

    public NotNecesaryIdException(String message){
        super(message);
    }

    public NotNecesaryIdException(String message, Throwable throwable){
        super(message, throwable);
    }
}
