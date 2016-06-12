package Module03.Task3;


public class NotEnoughInstruments extends Exception {
    private String message;

    public NotEnoughInstruments(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
