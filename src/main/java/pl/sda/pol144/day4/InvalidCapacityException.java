package pl.sda.pol144.day4;

/**
 * Przykład własnego wyjątku!
 */
public class InvalidCapacityException extends RuntimeException{
    public InvalidCapacityException(String message) {
        super(message);
    }
}
