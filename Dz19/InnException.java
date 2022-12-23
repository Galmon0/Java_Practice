package Dz19;

public class InnException extends Exception {
    public InnException() {
    }

    public InnException(String message) {
        super(message);
    }

    public InnException(String message, Throwable cause) {
        super(message, cause);
    }

    public InnException(Throwable cause) {
        super(cause);
    }

    public InnException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
