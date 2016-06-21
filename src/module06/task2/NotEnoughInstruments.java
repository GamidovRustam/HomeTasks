package module06.task2;


public class NotEnoughInstruments extends Exception {
    private String message;

    public NotEnoughInstruments(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}