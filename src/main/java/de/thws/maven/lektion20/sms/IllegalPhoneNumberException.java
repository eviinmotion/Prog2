package de.thws.maven.lektion20.sms;

public class IllegalPhoneNumberException extends RuntimeException {
    public IllegalPhoneNumberException(String message) {
        super(message);
    }
}
