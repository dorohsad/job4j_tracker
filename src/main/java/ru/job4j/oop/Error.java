package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние ошибки " + this.active);
        System.out.println("Статус ошибки " + this.status);
        System.out.println("Сообщение " + this.message);
    }

    public static void main(String[] args) {
        Error simpleError = new Error();
        Error printerError = new Error(true, 1, "Сломался принтер");
        Error laptopError = new Error(true, 10, "Не грузится лэптоп");
        Error questionError = new Error(false, 0, "Плавающая ошибка");
        printerError.printInfo();
        laptopError.printInfo();
        questionError.printInfo();
        simpleError.printInfo();
    }
}
