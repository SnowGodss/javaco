package animal.zoo;

public class NameformatException extends RuntimeException{
    public NameformatException(){}

    public NameformatException(String message) {
        super(message);
    }
}