package ErrorHandler;

public class ErrorHandler extends Exception{
    private final int code;
    private String defaultMessage;

    ErrorHandler(int code, String defaultMessage) {
        super(defaultMessage);
        this.code = code;
        this.defaultMessage = defaultMessage;

    }

    public int getCode() { return code; }
    public String getDefaultMessage() { return defaultMessage; }
}
