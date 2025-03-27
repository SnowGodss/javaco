package animal.zoo;

public class AgeOutofBoundsException extends RuntimeException {
    public AgeOutofBoundsException(){}

    public AgeOutofBoundsException(String message) {
        super(message);
    }
}
