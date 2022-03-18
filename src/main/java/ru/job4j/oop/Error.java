package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public void info() {
        System.out.println("Activity - " + active);
        System.out.println("Status - " + status);
        System.out.println(message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 4, "dangerous activity");
        Error error2 = new Error(false, 0, "normal");
        error.info();
        error1.info();
        error2.info();
    }
}
