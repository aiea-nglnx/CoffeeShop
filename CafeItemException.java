import java.util.Scanner;

/**
 * An interactive program Java program that models an environment
 * Custom exception
 */
 
public class CafeItemException extends Exception {
    public CafeItemException(String message) {
        super(message); // Passes the message to the Exception superclass
    }
}
